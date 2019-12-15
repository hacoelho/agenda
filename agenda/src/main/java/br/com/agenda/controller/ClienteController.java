package br.com.agenda.controller;

import java.util.Optional;

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

import br.com.agenda.error.CustomErrorType;
import br.com.agenda.model.Cliente;
import br.com.agenda.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
public class ClienteController
{
	private final ClienteRepository clienteDAO;

	
    @Autowired
	public ClienteController(ClienteRepository clienteDAO)
	{
		this.clienteDAO = clienteDAO;
	}
	
    @GetMapping
    public ResponseEntity<?> listAll()
    {
    	return new ResponseEntity<>(clienteDAO.findAll(), HttpStatus.OK);
    }
    
     
    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getUsuariosById(@PathVariable("id") Long id)
    {
    	Optional<Cliente> cliente = clienteDAO.findById(id);
    	if(cliente == null)
    		return new ResponseEntity<>(new CustomErrorType("Usuário não encontrado"),HttpStatus.NOT_FOUND);
    	return new ResponseEntity<>(cliente, HttpStatus.OK);
    }
    @GetMapping(path = "/findByNome/{nome}")
    public ResponseEntity<?> findUsuariosByNome(@PathVariable String nome)
    {
    	return new ResponseEntity<>(clienteDAO.findByNomeIgnoreCaseContaining(nome),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Cliente cliente)
    {
    	return new ResponseEntity<>(clienteDAO.save(cliente) , HttpStatus.OK);
    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id)
    {
    	clienteDAO.deleteById(id);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Cliente cliente)
    {
    	clienteDAO.save(cliente);
    	return new ResponseEntity<>(HttpStatus.OK);
    }

}