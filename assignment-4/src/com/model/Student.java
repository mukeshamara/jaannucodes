package com.model;

public class Student {
protected String name;
public Student(String name) {
	super();
	this.name = name;
}
@Override
public String toString() {
	return "Employee [name=" + name;
}
}