package br.com.glsystem.escalux.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.glsystem.escalux.domain.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

	public List<Pessoa> findAll();
}
