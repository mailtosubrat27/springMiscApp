package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Person;
import com.app.service.PersonService;

@RestController
public class Personh2Controller {
	@Autowired
	private PersonService service;
	
	@PostMapping("/save")
	public String savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}
	
	@GetMapping("/getAll")
	public List<Person> getAllPerson() {
		return service.getAllPerson();
	}

}
