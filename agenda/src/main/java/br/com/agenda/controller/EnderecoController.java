package br.com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.model.Endereco;
import br.com.agenda.repository.EnderecoRepository;

@RestController
@RequestMapping("enderecos")
public class EnderecoController
{
	private final EnderecoRepository enderecoDAO;
	
	@Autowired
	public EnderecoController(EnderecoRepository enderecoDAO)
	{
		this.enderecoDAO = enderecoDAO;
	}
	
	@PostMapping
    public ResponseEntity<?> save(@RequestBody Endereco endereco)
    {
    	return new ResponseEntity<>(enderecoDAO.save(endereco), HttpStatus.OK);
    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id)
    {
    	enderecoDAO.deleteById(id);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Endereco endereco)
    {
    	enderecoDAO.save(endereco);
    	return new ResponseEntity<>(HttpStatus.OK);
    }

}
