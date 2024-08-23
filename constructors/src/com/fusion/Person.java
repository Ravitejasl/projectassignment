package com.fusion;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this.name="unknown";
		this.age=0;
	}

	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void displayPerson() {
		System.out.println("Name:"+this.name+",Age:"+this.age);
	}

	
		
	
		
	}


