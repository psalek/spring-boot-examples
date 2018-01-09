package io.pivotal.web;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.pivotal.web.domain.Code;
import io.pivotal.web.domain.Language;
import io.pivotal.web.domain.Snippet;
import io.pivotal.web.repository.LanguageRepository;
import io.pivotal.web.repository.SnippetRepository;

@SpringBootApplication
public class SimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
	
	@SuppressWarnings("serial")
	@Bean
	public CommandLineRunner runner(SnippetRepository repo, LanguageRepository langRepo){
		return args -> {
			
			List<Language> langs = new ArrayList<Language>(){{
				add(new Language("HTML","xml"));
				add(new Language("Groovy","groovy"));
				add(new Language("C#","c#"));
				add(new Language("Pascal","py"));
				add(new Language("Erlang","erl"));
				add(new Language("JavaScript","js"));
				
			}};
			
			langRepo.saveAll(langs);
			
			List<Snippet> snippets = new ArrayList<Snippet>() {{
				add(new Snippet("Hello World",langRepo.findBy("HTML").get(), new Code(new String(Files.readAllBytes(Paths.get("code/html-code.txt"))))));
				add(new Snippet("Hello World",langRepo.findBy("C#").get(), new Code(new String(Files.readAllBytes(Paths.get("code/cs-code.txt"))))));
				add(new Snippet("Hello World",langRepo.findBy("Pascal").get(), new Code(new String(Files.readAllBytes(Paths.get("code/pas-code.txt"))))));
				add(new Snippet("Hello World",langRepo.findBy("Erlang").get(), new Code(new String(Files.readAllBytes(Paths.get("code/erl-code.txt"))))));
				add(new Snippet("Hello World",langRepo.findBy("Groovy").get(), new Code("println 'Hello World'")));
			}};
			
			repo.saveAll(snippets);
		};
	}
}
