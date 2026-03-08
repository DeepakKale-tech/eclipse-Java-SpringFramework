package com.kale.deepak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kale.deepak.dao.Student;

@Controller
@RequestMapping("/")
public class StudentController {

	@PostMapping("/student")
	public String getStudent(@ModelAttribute Student student, Model model)
	//public String getStudent(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("age") int age, Model model) 
	{
		
		//Student s1 = new Student(id,name,age);
		model.addAttribute("student",student);
		
		return "show";
	}
	
}
