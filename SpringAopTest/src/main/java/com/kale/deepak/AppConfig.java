package com.kale.deepak;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.kale.deepak")
@EnableAspectJAutoProxy
public class AppConfig {
	
}
