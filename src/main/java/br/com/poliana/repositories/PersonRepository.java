package br.com.poliana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.poliana.Model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
