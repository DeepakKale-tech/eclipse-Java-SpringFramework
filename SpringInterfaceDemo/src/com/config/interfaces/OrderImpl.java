package com.config.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Oi")
public class OrderImpl implements OrderInterface {

	@Autowired
	@Qualifier
	private OrderDaoInterface dao;
	
	public OrderDaoInterface getDao() {
		return dao;
	}
	public void setDao(OrderDaoInterface dao) {
		this.dao = dao;
	}
	@Override
	public void placeorder() {
		dao.createorder();
		System.out.println("placeorder method inside OrderImpl class");
		

	}

}
