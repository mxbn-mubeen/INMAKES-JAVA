package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	public HomeController() {
		
		System.out.println("front-controller invoked");
	}

	@RequestMapping("/home")
	public String homepage(@RequestParam("name") String myname,HttpSession session) {
		
		
		session.setAttribute("n", myname);
		return "home";
	}
}
