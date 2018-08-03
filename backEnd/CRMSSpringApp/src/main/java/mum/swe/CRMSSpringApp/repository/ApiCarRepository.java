package mum.swe.CRMSSpringApp.repository;
import mum.swe.CRMSSpringApp.model.Car;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
public interface ApiCarRepository extends PagingAndSortingRepository<Car, Long> {



}
