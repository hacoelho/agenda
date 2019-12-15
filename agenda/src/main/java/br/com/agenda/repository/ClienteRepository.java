package br.com.agenda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.agenda.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>
{
	List<Cliente> findByNomeIgnoreCaseContaining(String nome);
}
