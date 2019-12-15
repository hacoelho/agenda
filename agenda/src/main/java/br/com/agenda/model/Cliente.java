package br.com.agenda.model;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	@CPF
	private String cpf;
	
	//Telefones
	private String telFixo;
	private String telCelular;
	
	//Email
	private String email;
	
	//Endereço Cliente
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	

		
	//GETTERS SETTERS
	public String getNome() 		           {return nome;}
	public void setNome(String nome)           {this.nome = nome;}
	public String getCpf() 			           {return cpf;}
	public void setCpf(String cpf)             {this.cpf = cpf;}
	
	//GETTERS SETTERS ENDEREÇO
	public String getCep()                       {return cep;}
	public void setCep(String cep)               {this.cep = cep;}
	public String getLogradouro()                {return logradouro;}
	public void setLogradouro(String logradouro) {this.logradouro = logradouro;}
	public String getBairro()                    {return bairro;}
	public void setBairro(String bairro)         {this.bairro = bairro;}
	public String getCidade()                    {return cidade;}
	public void setCidade(String cidade)         {this.cidade = cidade;}
	public String getUf()                        {return uf;}
	public void setUf(String uf)                 {this.uf = uf;}
	
	//GETTERS SETTERS Telefones
	public String getTelFixo()                   {return telFixo;}
	public void setTelFixo(String telFixo)       {this.telFixo = telFixo;}
	public String getTelCelular()                {return telCelular;}
	public void setTelCelular(String telCelular) {this.telCelular = telCelular;}
	
	//GETTERS SETTERS Email
	public String getEmail()           {return email;}
	public void setEmail(String email) {this.email = email;}
	
}