package com.example;

public class Employee1 {
	String age;
	String code;
    String state;
    
public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

public void show()
{
	System.out.println("employee1"+age+code+state);
}
}
