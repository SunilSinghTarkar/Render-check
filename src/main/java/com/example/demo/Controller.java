package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String hello() {
		return "Hello render";
	}
	@GetMapping("welcome")
	public String welcome() {
	    return "<h1 style=\"background-color: yellow; text-align: center;\">Welcome to this website.</h1>";
	}

}
