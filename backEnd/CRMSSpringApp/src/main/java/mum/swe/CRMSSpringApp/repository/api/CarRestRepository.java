package mum.swe.CRMSSpringApp.repository.api;

import mum.swe.CRMSSpringApp.model.Car;
import mum.swe.CRMSSpringApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
public interface CarRestRepository extends PagingAndSortingRepository<Car, Long> {

    List<Car> findByBrand(@Param("brand") String brand);


}
