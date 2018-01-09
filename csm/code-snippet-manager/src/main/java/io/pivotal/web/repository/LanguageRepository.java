package io.pivotal.web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.pivotal.web.domain.Language;

@Repository
public class LanguageRepository implements SimpleRepository<Language>{

    private List<Language> languages;
	
	public List<Language> findAll(){
		return languages;
	}	
	
	public void saveAll(List<Language> languages){
		this.languages = languages;
	}
	
	public Optional<Language> findBy(String name) {
		return languages.stream()
				.filter(lang -> lang.getName().equals(name))
				.findFirst();
	}
}
