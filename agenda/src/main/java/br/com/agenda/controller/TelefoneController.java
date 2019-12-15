package br.com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.model.Telefone;
import br.com.agenda.repository.TelefoneRepository;

@RestController
@RequestMapping("telefones")
public class TelefoneController 
{
     private final TelefoneRepository telefoneDAO;
	
	@Autowired
	public TelefoneController(TelefoneRepository telefoneDAO)
	{
		this.telefoneDAO = telefoneDAO;
	}
	
	@PostMapping
    public ResponseEntity<?> save(@RequestBody Telefone telefone)
    {
    	return new ResponseEntity<>(telefoneDAO.save(telefone), HttpStatus.OK);
    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id)
    {
    	telefoneDAO.deleteById(id);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Telefone telefone)
    {
    	telefoneDAO.save(telefone);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    
    @GetMapping
    public ResponseEntity<?> listAll()
    {
    	return new ResponseEntity<>(telefoneDAO.findAll(), HttpStatus.OK);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}