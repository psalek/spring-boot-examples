package io.pivotal.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.pivotal.web.domain.Snippet;
import io.pivotal.web.repository.SnippetRepository;

@RestController
public class SnippetController {
	
	@Autowired
	SnippetRepository snippetRepository;
	
	@RequestMapping("/snippets")
	public Iterable<Snippet> snippets(){
		assert snippetRepository != null;
		return snippetRepository.findAll();
	}
	
	@RequestMapping("/snippets/{id}")
	public Snippet snippet(@PathVariable("id") String id){
		assert snippetRepository != null;
		return snippetRepository.findOne(id);
	}
	
	@RequestMapping(value="/snippets",method = { RequestMethod.POST})
	public  ResponseEntity<?> add(@RequestBody Snippet snippet){
		assert snippetRepository != null;
		
		Snippet _snippet = snippetRepository.save(snippet);
		assert _snippet != null;
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/" + _snippet.getId())
				.buildAndExpand().toUri());
		
		return new ResponseEntity<>(_snippet,httpHeaders,HttpStatus.CREATED);
	}
	
}
