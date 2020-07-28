package com.myco.microservicesgeneral.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Resources {
	@RequestMapping("/main")
	public String main() {

		return "inside main";
	}
	
}
