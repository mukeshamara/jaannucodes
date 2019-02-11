package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
import com.model.Student;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("app.xml"); 
        Student s=(Student)ac.getBean("student");
		System.out.println(s);
		Employee e=(Employee)ac.getBean("employee");
		System.out.println(e);
		ac.registerShutdownHook();
	}
}
