package com.jsp.clickNBuy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DataExistsException extends RuntimeException {
	String message="Data Already Exists";
}
