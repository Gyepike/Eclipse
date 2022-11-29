package com.anti.controller.greeting;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.anti.dao.Alien;


// same jasper version as tomcat version  need in the maven for tomcat !!
// without jasper there is not jsp page !!!
//localhost:8080/home?name=Munyi

@Controller  // RestController cannot use jsp 
public class HomeController {

	@GetMapping("/home")	
	//http://localhost:8080/home?fname=bubu&lname=a
	// @RequestParam("fname") String myName, @RequestParam("lname") String lastName
	
	//http://localhost:8080/home?aid=1&aname=alma&tech=java
	// Alien 
	public ModelAndView home(Alien alien ) {
		
		       // new ModelAndView("home", "fname", myName );
		        
	
		        ModelAndView mv = new ModelAndView();
		        mv.addObject("obj", alien);
		        /* 
		        mv.addObject("fname", myName);
		         mv.addObject("lname", lastName );
		         mv.setViewName("home");
		         System.out.println(mv.toString());
		         */
		        
		       // dispather need data (view + modell ) 
		
		
		 return  mv; // dispather need view name  (view + modell )
	}
	
	
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
	
	
}
