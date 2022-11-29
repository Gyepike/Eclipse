package com.anti.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	
	@ModelAttribute  // executed before all method calls !!!
	public void welcome(Model m) 
	{
		
		m.addAttribute("w", "Welcome");
		
	}
	
	//http://localhost:8080/a
	@RequestMapping(method= RequestMethod.GET, value= "/a" )
	public ModelAndView home() {

		ModelAndView mv = new ModelAndView();
	

		var now = LocalDateTime.now();
		var formatter = DateTimeFormatter.ISO_DATE_TIME;
		var dateTimeFormatted = formatter.format(now);

		mv.addObject("now", dateTimeFormatted);
		mv.setViewName("home");
		return mv; // "home"
	}
}

/*
@GetMapping("/home2")
//@ResponseBody
// @ResponseBody print data "home" String not home.jsp on the screen
public String home2(HttpServletRequest req) {
	
	String name = req.getParameter("name");
	System.out.println("hi !! "+name);
	
	 HttpSession session = req.getSession(); 
	
	  session.setAttribute("name", name);
	 return "home";
}
*/