package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImp2 implements OrderDaoInterface {

	@Override
	public void createorder() {
		System.out.println("inside OrderDaoImple2 class");
	}

}
