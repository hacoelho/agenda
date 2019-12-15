package br.com.agenda.model;

import javax.persistence.Entity;

@Entity
public class AgendaUser extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	//GETTERS SETTERS
	public String getUsername()              {return username;}
	public void setUsername(String username) {this.username = username;}
	public String getPassword()              {return password;}
	public void setPassword(String password) {this.password = password;}
	
}
