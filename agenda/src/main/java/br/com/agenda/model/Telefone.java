package br.com.agenda.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Telefone extends AbstractEntity
{
	private String telefone;
	
	@ManyToOne
	private Cliente cliente;
	
	
	//GETTERS SETTERS
	public String getTelefone()              {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public Cliente getCliente()              {return cliente;}
	public void setCliente(Cliente cliente)  {this.cliente = cliente;}
	
}
