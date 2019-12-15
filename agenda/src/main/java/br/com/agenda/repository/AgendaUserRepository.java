package br.com.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.agenda.model.AgendaUser;

public interface AgendaUserRepository extends CrudRepository<AgendaUser, Long>
{

}
