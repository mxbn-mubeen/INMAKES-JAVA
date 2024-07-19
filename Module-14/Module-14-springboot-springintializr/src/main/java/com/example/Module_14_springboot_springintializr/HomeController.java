package com.example.Module_14_springboot_springintializr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
	
		System.out.println("front-controller-invoked");
	}
	
	@RequestMapping("/")
	public String homepage() {
		
		return "home.jsp";
		
	}

}
