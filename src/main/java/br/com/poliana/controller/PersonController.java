package br.com.poliana.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.poliana.Model.Person;
import br.com.poliana.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;

	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET,
			produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable("id") String id) {
		return service.findById(id);
		
	}
}
