package io.pivotal.web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.pivotal.web.domain.Code;

@Repository
public class CodeRepository implements SimpleRepository<Code>{

	private List<Code> codes;

	public List<Code> findAll() {
		return codes;
	}

	public void saveAll(List<Code> codes) {
		this.codes = codes;
	}

	public Optional<Code> findBy(String id) {
		return codes.stream()
				.filter(code -> code.getId().equals(id))
				.findFirst();
	}

	
}
