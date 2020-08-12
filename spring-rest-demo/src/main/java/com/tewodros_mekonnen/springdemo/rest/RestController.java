package com.tewodros_mekonnen.springdemo.rest;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

	// add code for the "/hello" endpoint
	@GetMapping("/hello")
	public String sayHelloWorld() {

		return "Hello World!";
	}

	

}
