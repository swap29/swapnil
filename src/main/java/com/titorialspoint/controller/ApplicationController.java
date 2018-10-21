package com.titorialspoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.titorialspoint.daoRepo.daoRepo;
import com.titorialspoint.model.User;

@Controller
public class ApplicationController {
	
	@Autowired
	daoRepo daorepo;
	
	
	@RequestMapping("/")
	public String home()
	{
		
		return "register.jsp";
	}
	
	@RequestMapping("/reg") 
	public String addData(User user)
	{
		daorepo.save(user);
		
		return "home.jsp";
	}
	
	@RequestMapping("/log")
	public ModelAndView allData()
	{
		
		List<User> user2= (List<User>) daorepo.findAll();
		//model.addAttribute("data", user2);
		
		return new ModelAndView("showData.jsp","user" , user2);
	}
	
	
	@RequestMapping("/update") 
	public String updateData(User user)
	{
		daorepo.save(user);
		
		return "home.jsp";
	}
	
	
	

}
