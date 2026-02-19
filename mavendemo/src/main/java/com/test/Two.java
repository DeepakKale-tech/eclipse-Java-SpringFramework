package com.test;

public class Two {

	One one;
	
	public One getOne() {
		return one;
	}

	public void setOne(One one) {
		this.one = one;
	}

	Two()
	{
		System.out.println("Constructor Two is executed");
	}
	
	void show()
	{
		one.show();
		System.out.println("Method of two");
	}
}
