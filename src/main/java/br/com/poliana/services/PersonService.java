package br.com.poliana.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.poliana.Model.Person;

@Service
public class PersonService {
	//Operacoes para cadastrar uma pessoa

	private final AtomicLong counter = new AtomicLong(); // como ainda nao estamos trabalhando com banco ,

	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}
	
	
	
	



	public Person findById(String id) {
		logger.info("Finding one person!");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());//Simula um acesso ao banco,persistencia e retorno aos dados
		person.setFirstName("Poliana");
		person.setLasttName("Beatriz");
		person.setAddress("Conselheiro Lafaiete - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
		
	}
	
	private Person mockPerson(int i) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());//Simula um acesso ao banco,persistencia e retorno aos dados
		person.setFirstName("Firstname " + i);
		person.setLasttName("Lastname " + i);
		person.setAddress("Some Addres in Brasil");
		person.setGender("Male");
		return person;	}
}
