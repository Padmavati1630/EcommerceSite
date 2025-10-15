package com.jsp.clickNBuy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {

	private String message;
	private Object data;
}
