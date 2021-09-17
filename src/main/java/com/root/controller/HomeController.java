package com.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/")
public class HomeController {
	
//	@GetMapping
//	public ModelAndView homepage()
//	{
//		ModelAndView model = new ModelAndView();
//		model.setViewName("Home");
//		return model;
//	}
	
	@GetMapping
	public String homepage()
	{
		return "Home";
	}
}
