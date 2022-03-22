package com.worldline.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private @Value("${salutation}")String salutation;
	@Autowired
	private Student s;
	@GetMapping("/hello")
	public String sayHello(@RequestParam("name")String name) {
		return salutation+" "+s.toString();
		}
}
