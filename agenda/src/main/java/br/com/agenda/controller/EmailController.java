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

import br.com.agenda.model.Email;
import br.com.agenda.repository.EmailRepository;

@RestController
@RequestMapping("emails")
public class EmailController
{
	private final EmailRepository emailDAO;
	
	@Autowired
	public EmailController(EmailRepository emailDAO)
	{
		this.emailDAO = emailDAO;
	}
	
	@PostMapping
    public ResponseEntity<?> save(@RequestBody Email email)
    {
    	return new ResponseEntity<>(emailDAO.save(email), HttpStatus.OK);
    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id)
    {
    	emailDAO.deleteById(id);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Email email)
    {
    	emailDAO.save(email);
    	return new ResponseEntity<>(HttpStatus.OK);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
}
