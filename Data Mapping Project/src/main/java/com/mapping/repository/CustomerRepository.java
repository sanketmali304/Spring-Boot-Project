package com.mapping.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mapping.dto.AddressDetails;
import com.mapping.dto.OrderResponse;
import com.mapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("SELECT new com.mapping.dto.OrderResponse( c.name,p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJointInformation();
	
	@Query("select new com.mapping.dto.AddressDetails(a.aid,a.city,a.currentAddress) from Address a")
	public List<AddressDetails> getAddress();
}
