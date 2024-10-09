package com.example.medelpar_test_auto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String helloworld() {
		return "hello world";
	}

}
