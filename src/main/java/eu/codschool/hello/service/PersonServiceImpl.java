package eu.codschool.hello.service;

import java.util.List;
import eu.codschool.hello.entity.Person;
import eu.codschool.hello.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	PersonRepository personRepository;

	public PersonServiceImpl(PersonRepository personRepository){
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> findByName(String name) {
		return personRepository.findByName(name);
	}

	@Override
	public Person findByEmail(String email) {
		return personRepository.findByEmail(email);
	}

	@Override
	public Person save(Person p) {
		return personRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		personRepository.deleteById(id);
	}

	@Override
	public void delete(Person p) {
		personRepository.delete(p);
	}
}