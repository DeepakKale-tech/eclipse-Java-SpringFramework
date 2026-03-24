package com.kale.deepak.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	@Before("execution (* com.kale.deepak.service.*.*(..))")
	public void logBefore()
	{
		System.out.println("Logging before method execution....");
	}
	
	@After("execution (* com.kale.deepak.service.*.*(..))")
	public void logAfter()
	{
		System.out.println("Logging after method execution....");
	}
	
	@Around("execution (* com.kale.deepak.service.*.*(..))")
	public void beforeAfter()
	{
		System.out.println("Logging before-After Around method execution....");
	}
}
