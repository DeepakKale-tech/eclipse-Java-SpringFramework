package com.config.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Math).abs(-99)}")
	private int id;
	@Value("#{'Deepak Kale'.toUpperCase()}")
	private String name;
	@Value("#{topics}")
	private List<String> topics;
	
	@Value("#{(2+4>8?false:true)}")
	private boolean active;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Autowired
	private Profile profile;
	
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
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
				+ profile + "]";
	}
	
	
	
}
