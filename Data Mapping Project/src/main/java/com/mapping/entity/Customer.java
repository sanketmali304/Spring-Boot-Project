package com.mapping.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String gender;
	
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_id")
	private Address address;
	
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer_Id",referencedColumnName = "id")
	private List<Product> products;
	
	
}
