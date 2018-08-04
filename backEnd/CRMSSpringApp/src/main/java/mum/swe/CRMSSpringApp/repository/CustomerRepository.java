package mum.swe.CRMSSpringApp.repository;
import mum.swe.CRMSSpringApp.model.Car;
import mum.swe.CRMSSpringApp.model.Customer;
import mum.swe.CRMSSpringApp.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    List<Customer> findByFirstName(@Param("firstName") String firstName);

}
