package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee e1 = (Employee)context.getBean(Employee.class);
		e1.display();
		
		Student s1 = (Student)context.getBean(Student.class);
		s1.show();
	}
}
