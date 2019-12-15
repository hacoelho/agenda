package br.com.agenda.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Email extends AbstractEntity
{
	
	private boolean principal;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	@JsonIgnore
	private Cliente cliente;
	
	@javax.validation.constraints.Email
	private String email;
	
	
	//GETTERS SETTERS
	public String getEmail()                      {return email;}
	public void setEmail(String email)            {this.email = email;}
	public boolean isPrincipal()                  {return principal;}
	public void setPrincipal(boolean principal)   {this.principal = principal;}
	public Cliente getCliente()                   {return cliente;}
	public void setCliente(Cliente cliente)       {this.cliente = cliente;}

}
