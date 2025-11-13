package br.com.poliana.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poliana.Model.Person;
import br.com.poliana.exception.ResourceNotFoundException;
import br.com.poliana.repositories.PersonRepository;

@Service
public class PersonService {
	//Operacoes para cadastrar uma pessoa

	private final AtomicLong counter = new AtomicLong(); // como ainda nao estamos trabalhando com banco ,
	private Logger logger = Logger.getLogger(PersonService.class.getName());

	
	@Autowired
	PersonRepository repository;
	
	
	public List<Person> findAll() {
		
		logger.info("Finding all People!");
		return repository.findAll();
	}
	
	
	
	
	public Person findById(Long id) {
		logger.info("Finding all person!");
		
		return repository.findById(id).orElseThrow(()
			->new  ResourceNotFoundException("No trecords found for this id!"));
	}
	
	
	public Person create(Person person) {
		logger.info("Creating one Person!");
		return repository.save(person);
	}
	
	
	public Person update(Person person) {
		logger.info("Updating one Person!");
		
	Person entity =	repository.findById(person.getId()).orElseThrow(()
				->new  ResourceNotFoundException("No trecords found for this id!"));
		
	entity.setFirstName(person.getFirstName());
	entity.setLasttName(person.getLasttName());
	entity.setAddress(person.getAddress());
	entity.setGender(person.getGender());
				
		return repository.save(person);
	}
	
	
	public void  delete(Long id) {
		logger.info("Deleting one Person!");
		//recupera a entidade
		Person entity =	repository.findById(id).orElseThrow(()
				->new  ResourceNotFoundException("No trecords found for this id!"));
		repository.delete(entity);

	}
	
}