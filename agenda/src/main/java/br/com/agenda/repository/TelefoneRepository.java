package br.com.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.agenda.model.Telefone;

public interface TelefoneRepository extends CrudRepository<Telefone, Long>
{

}
