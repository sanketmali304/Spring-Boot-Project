package com.mapping.dto;

import org.springframework.stereotype.Service;

import com.mapping.entity.Address;
import com.mapping.entity.Customer;
import com.mapping.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Service
public class OrderRequest {
	private Customer customer;
	private Product product;
	private Address address;
}
