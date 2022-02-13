package com.mapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDetails {
	private  int aid;
	private String c;
	private String ca;
	
//	public AddressDetails(int aid, String c, String ca) {
//		super();
//		this.aid = aid;
//		this.c = c;
//		this.ca = ca;
//	}
	
	
	
}
