package mum.swe.CRMSSpringApp.service;

import mum.swe.CRMSSpringApp.model.Person;


import java.util.List;

public interface PersonService {
	 List<Person> findAll();
	 Person save(Person person);
	 Person findOne(Long id);
	 void delete(Long id);
}
