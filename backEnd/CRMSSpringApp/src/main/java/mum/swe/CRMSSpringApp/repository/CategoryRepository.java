package mum.swe.CRMSSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mum.swe.CRMSSpringApp.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
