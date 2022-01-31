package com.anti.StockInfo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String home(Model m) {
		
		System.out.println("Kuki");
		m.addAttribute("d", "Munyó & Munyi");
		
		return "home";
		
	}
}
