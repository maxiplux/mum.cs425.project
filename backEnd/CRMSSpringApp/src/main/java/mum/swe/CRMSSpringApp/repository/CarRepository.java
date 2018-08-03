package mum.swe.CRMSSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.swe.CRMSSpringApp.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
	
}
