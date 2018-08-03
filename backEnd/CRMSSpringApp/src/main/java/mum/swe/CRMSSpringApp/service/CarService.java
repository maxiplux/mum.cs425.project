package mum.swe.CRMSSpringApp.service;

import java.util.List;

import mum.swe.CRMSSpringApp.model.Car;

public interface CarService {
	 List<Car> findAll();
	 Car save(Car car);
//	 Car findOne(Long id);
	 Car findById(Long id);
	 void delete(Long id);
}
