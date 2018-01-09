package io.pivotal.web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.pivotal.web.domain.Snippet;

@Repository
public class SnippetRepository implements SimpleRepository<Snippet>{
	
	private List<Snippet> snippets;
	
	public List<Snippet> findAll(){
		return snippets;
	}	
	
	public void saveAll(List<Snippet> snippets){
		this.snippets = snippets;
	}
	
	public Optional<Snippet> findBy(String id) {
		return snippets.stream()
				.filter(snippet -> snippet.getId().equals(id))
				.findFirst();
	}
	
}
