package br.com.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.agenda.model.Email;

public interface EmailRepository extends CrudRepository<Email, Long>
{

}
