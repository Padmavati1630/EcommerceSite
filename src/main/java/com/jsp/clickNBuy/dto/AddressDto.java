package com.jsp.clickNBuy.dto;

import lombok.Data;

@Data
public class AddressDto {
	private String houseNo;
	private String landmark;
	private String street;
	private String area;
	private String city;
	private Long pincode;
}
