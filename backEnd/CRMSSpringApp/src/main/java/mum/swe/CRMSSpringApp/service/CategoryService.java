package mum.swe.CRMSSpringApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.swe.CRMSSpringApp.model.Category;

@Service
public interface CategoryService {
	 List<Category> findAll();
	 Category save(Category car);
//	 Car findOne(Long id);
	 Category findById(Long id);
	 void delete(Long id);
}
