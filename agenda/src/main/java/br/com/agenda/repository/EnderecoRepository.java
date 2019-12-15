package br.com.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.agenda.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Long>
{

}
