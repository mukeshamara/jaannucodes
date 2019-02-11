package com.model;

public class Employee {

private String name;
private String address;
private String salary;

public Employee(String name, String address, String salary) {
	super();
	this.name = name;
	this.address = address;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", salary="
			+ salary + "]";
}
}
