package com.Model;

public class Employee {
	private String id;
	private String name;
	private String age;
	public Employee(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void show()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
	
}
