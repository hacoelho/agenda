package br.com.agenda.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	@CPF
	private String cpf;
//	@OneToMany(mappedBy = "cliente")
//	private Set<Email> emails;
	
		
	//GETTERS SETTERS
	public String getNome() 		           {return nome;}
	public void setNome(String nome)           {this.nome = nome;}
	public String getCpf() 			           {return cpf;}
	public void setCpf(String cpf)             {this.cpf = cpf;}
//	public Set<Email> getEmails()              {return emails;}
//	public void setEmails(Set<Email> emails)   {this.emails = emails;}
	
}