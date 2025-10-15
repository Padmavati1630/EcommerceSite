package com.jsp.clickNBuy.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/text")
	public String testA() {
		return "This is test";
	}
}
