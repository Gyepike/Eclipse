package com.anti.controller.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.anti.dao.Alien2;
import com.anti.dao.Alien3;
import com.anti.repository.AlienRepo;

@Controller
public class AlienController {


	@Autowired
	AlienRepo repo;
	
	public void test() {
		System.out.println("Test");
	}
	
	@ModelAttribute  // executed before all method calls !!!
	public void welcome(Model m) 
	{
		
		m.addAttribute("w", "Welcome");
		
	}
	
	// for the url it is always get first url must be get !! we type browser !!! 
	@RequestMapping(method=RequestMethod.GET, value="/alien")
	public String aline() 
	{
		
		return "alien";
	}
	
	@PostMapping("getAliens")
	public String getAliens(Model m, @ModelAttribute("alien") Alien2 alien) 
	{

		System.out.println("------");
		//m.addAttribute("result", dao.getAliens());
		m.addAttribute("result", repo.findAll());
		//m.addAttribute("alien", alien);
		return "welcome";
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/updateAlien")
	public String welcomealine(@ModelAttribute("alien") Alien3 alien) 
	{
		
		System.out.println(repo.count());
		System.out.println("sssss");
	    alien.setAid(repo.count()+1+100);
		repo.save(alien);
		return "showAliens";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/findAlien")
	public String findAlien(Model m, @ModelAttribute("aid") long aid) 
	{
	      
		System.out.println(repo.findById(aid));
		m.addAttribute("result", repo.findById(aid));
		return "welcome";
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/findByAname")
	public String findByAname(Model m, @ModelAttribute("aname") String aname) 
	{
	      
		System.out.println(repo.findByAname(aname));
		//System.out.println(repo.countByAnameLike("%ka%"));
		//System.out.println(repo.findByAnameOrderByAidDesc(aname));
		//m.addAttribute("result", repo.findByAname(aname));
		
		test();
		//System.out.println(repo.findByAnameEndsWith(aname));
		//System.out.println("hello");
		m.addAttribute("result", repo.findByAnameEndsWith(aname));
		m.addAttribute("count", repo.countByAnameLike("%"+aname+"%"));
		
		return "welcome";
	}
	
	
}
