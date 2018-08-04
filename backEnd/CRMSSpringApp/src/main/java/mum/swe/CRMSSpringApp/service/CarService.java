package mum.swe.CRMSSpringApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.swe.CRMSSpringApp.model.Car;

@Service
public interface CarService {
	 List<Car> findAll();
	 Car save(Car car);
	 Car findById(Long id);
	 void delete(Long id);
//	 void updateCar(Car oldCar, Car newCar);
}
