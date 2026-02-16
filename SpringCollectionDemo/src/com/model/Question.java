package com.model;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<String> answer;

	public Question() {
	}

	public Question(int id, String name, List<String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}

	public void display() {
		System.out.println("Id: " + id + "  Question: " + name);
		System.out.println("Answers are: ");
		Iterator<String> itr = answer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
