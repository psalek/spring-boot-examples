package io.pivotal.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.pivotal.web.domain.Language;
import io.pivotal.web.domain.Snippet;
import io.pivotal.web.repository.SimpleRepository;

@RestController
public class MainController {
	
	@Autowired
	SimpleRepository<Snippet> snippetRepository;
	
	@Autowired
	SimpleRepository<Language> languageRepository;

	@RequestMapping("/")
	public ModelAndView home(){
		assert snippetRepository != null;
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("langs", languageRepository.findAll());
		model.put("snippets", snippetRepository.findAll());
		
		return new ModelAndView("views/home",model);
	}
	
}
