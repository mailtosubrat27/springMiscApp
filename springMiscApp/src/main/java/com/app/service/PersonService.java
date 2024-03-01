package com.app.service;

import java.util.List;

import com.app.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Person;
import com.app.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository repository;

	@Autowired
	private EmployeeRepo employeeRepo;

	
	public String savePerson(Person person) {
		repository.save(person);
		return "person saved ..";
	}

	public List<Person> getAllPerson() {
		
		return (List<Person>) repository.findAll();
	}

	public Person findPersonById(Integer id) {
		return repository.findPersonById(id);
	}

	public String saveEmployee(Person person) {
		employeeRepo.save(person);
		return "person saved ..";
	}
}
