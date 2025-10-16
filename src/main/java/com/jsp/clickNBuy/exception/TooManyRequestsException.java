package com.jsp.clickNBuy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TooManyRequestsException extends RuntimeException {
	private String message="Too many requests";
}
