package com.Model;
public class Employee {
private String id;
private String name;
private String technology;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public Employee(String id, String name, String technology) {
	super();
	this.id = id;
	this.name = name;
	this.technology = technology;
}
public Employee() {
	super();	
}



public Employee validate()
{
	Employee e=null;
	
	return e;
}






}
