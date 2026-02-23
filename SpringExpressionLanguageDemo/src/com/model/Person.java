package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("per1")
@Scope("prototype")
public class Person {

	@Value("21")
	private int id;
	//Expression lang. for String 
	@Value("#{'Deepak Kale'}")
	private String name;
	@Value("#{new java.lang.String('Deepak')}")
	private String n_object;
	@Value("#{'deepak kale'.toUpperCase()}")
	private String n_upper;
	@Value("#{'DEEPAK kale'.toLowerCase()}")
	private String n_lower;

	//Expre. Lang. for boolean
	@Value("#{(2+5>4)}")
	private Boolean ans1;
	@Value("#{(4+8>89?true:false)}")
	private Boolean ans2;
	
	//Expression language for addition and substraction
	@Value("#{20+21}")
	private int add;
	@Value("#{43-10}")
	private int sub;
	
	//Expression Language for tertiory operation
	//in simple words it works like if else condition
	//for ex.@Value("#{condition?true_if:false_else}")
	@Value("#{40>30?True:False}")
	private String max;
	@Value("#{29>2?10:20}")
	private int min;
	
	//Expre. lang. for static methods
	//absolute methode for only getting positive number
	//new Integer for getting Integer object
	//.MIN & .MAX value for finding constant value of max and min
	@Value("#{T(java.lang.Math).abs(-85)}")
	private int absolute;
	@Value("#{new Integer(98)}")
	private int new_int;
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int Min_Value;
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int Max_Value;
	
	//@Value("#{systemProperties['user.name']}")
	
	public Boolean getAns1() {
		return ans1;
	}

	public void setAns1(Boolean ans1) {
		this.ans1 = ans1;
	}

	public Boolean getAns2() {
		return ans2;
	}

	public void setAns2(Boolean ans2) {
		this.ans2 = ans2;
	}

	public String getN_object() {
		return n_object;
	}

	public void setN_object(String n_object) {
		this.n_object = n_object;
	}

	public String getN_upper() {
		return n_upper;
	}

	public void setN_upper(String n_upper) {
		this.n_upper = n_upper;
	}

	public String getN_lower() {
		return n_lower;
	}

	public void setN_lower(String n_lower) {
		this.n_lower = n_lower;
	}
	public int getNew_int() {
		return new_int;
	}

	public void setNew_int(int new_int) {
		this.new_int = new_int;
	}

	public int getMin_Value() {
		return Min_Value;
	}

	public void setMin_Value(int min_Value) {
		Min_Value = min_Value;
	}

	public int getMax_Value() {
		return Max_Value;
	}

	public void setMax_Value(int max_Value) {
		Max_Value = max_Value;
	}

	public int getAbsolute() {
		return absolute;
	}

	public void setAbsolute(int absolute) {
		this.absolute = absolute;
	}

	public int getAdd() {
		return add;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", n_object=" + n_object + ", n_upper=" + n_upper + ", n_lower="
				+ n_lower + ", ans1=" + ans1 + ", ans2=" + ans2 + ", add=" + add + ", sub=" + sub + ", max=" + max
				+ ", min=" + min + ", absolute=" + absolute + ", new_int=" + new_int + ", Min_Value=" + Min_Value
				+ ", Max_Value=" + Max_Value + "]";
	}
	
	
}
