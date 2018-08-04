package mum.swe.CRMSSpringApp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mum.swe.CRMSSpringApp.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Serializable>{
//	void updateCar(Car oldCar, Car newCar);
}
