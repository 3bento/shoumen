package br.com.kennycode.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String homePage() {
		System.out.println("I am working!!!");
		return "home";
	}
}
