package io.pivotal.web.repository;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.web.domain.Snippet;

public interface SnippetRepository extends CrudRepository<Snippet,String>{ //Or MongoRepository<Snippet,String>

}
