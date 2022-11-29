package com.anti.controller.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcrController {

;
	
	//http://localhost:8080/calc?fname=bubu&lname=a
	 @RequestMapping("/calc")
	 private String calc() {
		 return "calc"; 
	}
	 
	 @GetMapping("/sum")
	 //@RequestParam("fnumber") @RequestParam("lnumber") nem kotelezo ha neve ugyan az 
	 private ModelAndView sumcalc( @RequestParam(value ="fnumber", defaultValue = "0"  ) int fnumber,  @RequestParam(value = "lnumber", defaultValue = "0")   int lnumber,   ModelAndView view) {
		 int suma = fnumber + lnumber;
		 System.out.println(suma);
		 view.setViewName("sum");
		 view.addObject("suma", suma);
		 return view; 
	}
	
}
