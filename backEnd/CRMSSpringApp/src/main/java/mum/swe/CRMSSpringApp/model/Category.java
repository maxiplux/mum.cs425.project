package mum.swe.CRMSSpringApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cetegory")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "category_name")
	private String name;
	
	@Column(name = "category_price")
	private double price;
	
	@OneToMany(mappedBy = "category")
	private List<Car> cars = new ArrayList<Car>();
}
