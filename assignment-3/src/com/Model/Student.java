package com.Model;

public class Student{
private String id;
private String name;
private String address;
public Student(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

public void show()
{
	System.out.println("Id : "+id);
	System.out.println("Name : "+name);
	System.out.println("Address : "+address);
}


}
