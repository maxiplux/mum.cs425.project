package mum.swe.CRMSSpringApp.service.impl;

import java.util.List;
import mum.swe.CRMSSpringApp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mum.swe.CRMSSpringApp.model.Category;
import mum.swe.CRMSSpringApp.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category findById(Long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}
}

