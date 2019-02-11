package com.Model;


public class Student {

	private String id;
	private String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void show()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}
