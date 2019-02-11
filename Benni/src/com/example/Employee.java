package com.example;
public class Employee {
	
	String age;
	String state;
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void show()
	{
		System.out.println("employee1"+age+state);
	}
}