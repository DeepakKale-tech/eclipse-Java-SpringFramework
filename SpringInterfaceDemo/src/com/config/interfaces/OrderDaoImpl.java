package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDaoImpl implements OrderDaoInterface {

	@Override
	public void createorder() {
		// TODO Auto-generated method stub
		System.out.println("createorder method inside OrderDaoImple class");

	}

}
