package eu.codschool.hello.service;

import java.util.List;

import eu.codschool.hello.entity.Person;

public interface PersonService {
    List<Person> findByName(String name);
    Person findByEmail(String email);
    Person save(Person p);
	void delete(Long id);
	void delete(Person p);
}
