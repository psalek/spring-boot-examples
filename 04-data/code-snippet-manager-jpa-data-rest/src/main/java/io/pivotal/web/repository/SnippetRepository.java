package io.pivotal.web.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.web.domain.Snippet;

@Transactional
public interface SnippetRepository extends CrudRepository<Snippet,String>{

}
