package com.deepak.mymaven.Dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/deepak/mymaven/Dao/spring.xml");
        StudentDao dao = (StudentDao)context.getBean("studentdao");
        
        //insert
        dao.save(new Student("Deepak2","deepak@example2.com"));
        
        //display
        List<Student> students = dao.findAll();
        for(Student s: students)
        {
        	System.out.println("ID: "+s.getId());
        	System.out.println("Name: "+s.getName());
        	System.out.println("Email: "+s.getEmail());
        }
        
        //delete
        dao.delete(1);
	}

}
