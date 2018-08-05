package mum.swe.CRMSSpringApp.service;


import mum.swe.CRMSSpringApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("personRepository")
public interface Personrepository extends JpaRepository<Person, Long> {
}
