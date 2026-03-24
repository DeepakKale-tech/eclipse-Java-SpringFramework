package com.kale.deepak.SpringAopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kale.deepak.AppConfig;
import com.kale.deepak.service.PaymentService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentService service = context.getBean(PaymentService.class);
		
		service.processPayment();
    }
}
