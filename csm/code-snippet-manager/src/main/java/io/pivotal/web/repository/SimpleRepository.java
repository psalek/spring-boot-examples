package io.pivotal.web.repository;

import java.util.List;
import java.util.Optional;

public interface SimpleRepository<T> {

	List<T> findAll();
	void saveAll(List<T> rows);
	Optional<T> findBy(String id);
}
