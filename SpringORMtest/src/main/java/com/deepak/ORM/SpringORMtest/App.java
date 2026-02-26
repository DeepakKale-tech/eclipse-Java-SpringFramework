package com.deepak.ORM.SpringORMtest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/deepak/ORM/SpringORMtest/config.xml");

		ProductDao productDao = (ProductDao) context.getBean("productDao");

		Product product = new Product();

		product.setId(4);
		product.setName("Smart TV");
		product.setDesc("Android TV of Samsung series");
		product.setPrice(98000);

		// productDao.create(product);
		// productDao.update(product);
		// productDao.delete(product);

		Product product2 = productDao.find(3);
		System.out.println(product2);

		List<Product> products = productDao.findAll();

		/*
		 * for (Product p : products) { System.out.println(p); }
		 */
	}
}
