package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	
	@GetMapping(value="getHello")
	public String getEmp() {
		return "Hello Welcome";
	}

}
