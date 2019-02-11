package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private String id;
private String name;
@Autowired
private Address address;
public Student(String id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

public void show()
{
	System.out.println("Id : "+id);
	System.out.println("Name : "+name);
	System.out.println("Address : "+address.getCity()+"-"+address.getState());
}
}
