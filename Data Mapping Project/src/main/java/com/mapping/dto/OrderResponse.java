package com.mapping.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class OrderResponse {
	private String customerName;
	private String productName;
//	private int price;
//	
//	public OrderResponse(String customerName,String productName) {
//		super();
//		this.customerName = customerName;
//		this.productName = productName;
//	}
	
	
}
