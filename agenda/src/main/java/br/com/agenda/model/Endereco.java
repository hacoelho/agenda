package br.com.agenda.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Endereco extends AbstractEntity 
{
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	
	@OneToOne
	private Cliente cliente;
	
	
	//GETTERS SETTERS
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
	public Cliente getCliente()                  {return cliente;}
	public void setCliente(Cliente cliente)      {this.cliente = cliente;}
	
}