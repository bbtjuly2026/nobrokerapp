package com.no_broker_app.restContorler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/nobroker/")
public class Customer {
	//http://localhost:8080/api/nobroker/welcome
	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}

	
	//http://localhost:8080/api/nobroker/hello
		@GetMapping("/hello")
		public String hello() {
			
			return "hello";
		}
}
