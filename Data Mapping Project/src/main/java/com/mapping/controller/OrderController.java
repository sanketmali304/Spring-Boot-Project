package com.mapping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.dto.AddressDetails;
import com.mapping.dto.OrderRequest;
import com.mapping.dto.OrderResponse;
import com.mapping.entity.Customer;
import com.mapping.repository.CustomerRepository;
import com.mapping.repository.ProductRepository;

@RestController
@RequestMapping(value="/order")
public class OrderController {

	@Autowired	
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request)
	{
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJointInformation()
	{
		return customerRepository.getJointInformation();
	}
	
	@GetMapping("/getAddress")
	public List<AddressDetails> getAddress()
	{
		return customerRepository.getAddress();
	}
	
}
