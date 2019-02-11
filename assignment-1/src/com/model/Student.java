package com.model;

public class Student {
private String id;
private String name;
private String address;

public void setId(String id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}

public void show()
{
	System.out.println("Id : "+id);
	System.out.println("Name : "+name);
	System.out.println("Address : "+address);
}
}
