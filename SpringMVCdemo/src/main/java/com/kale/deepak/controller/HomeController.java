package com.kale.deepak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home(Model model)
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("Name","Deepak");
		modelAndView.addObject("Id",007);
		modelAndView.addObject("Salary",500000);
		return modelAndView;
	}
}
