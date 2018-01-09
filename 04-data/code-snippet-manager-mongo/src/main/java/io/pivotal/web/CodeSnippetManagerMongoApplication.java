package io.pivotal.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.pivotal.web.domain.Snippet;
import io.pivotal.web.repository.SnippetRepository;

@SpringBootApplication
public class CodeSnippetManagerMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeSnippetManagerMongoApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner runner(SnippetRepository repo){
	    return args -> {
	    	
	    	repo.deleteAll();
	    	
	    	repo.save(new Snippet("JavaScript: Hello World","console.log('Hello World!');"));
	    	repo.save(new Snippet("HTML: Hello World","<html><body><h1>Hello World</h1></body></html>"));
	    	repo.save(new Snippet("Bash: Hello World","echo \"Hello World\""));
	    	repo.save(new Snippet("Python: Hello World","print \"Hello World\""));
	    };
	}
}
