package mum.swe.CRMSSpringApp.service;



import mum.swe.CRMSSpringApp.model.Student;

import java.util.List;

public interface StudentService {
	 List<Student> findAll();
	 Student save(Student student);
	 Student findOne(Long id);
	 void delete(Long id);
}
