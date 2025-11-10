package br.com.poliana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.poliana.Model.Person;
import br.com.poliana.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private static final String ID2 = "id";
	@Autowired
	private PersonService service;

	
	@RequestMapping(method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return service.findAll();
	}
	
	
	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable(ID2) String id) {
		return service.findById(id);
		
	}
	

}
