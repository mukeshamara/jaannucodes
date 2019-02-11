package com.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Student;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("app.xml"); 
        Student s=(Student)ac.getBean("student");
		s.show();	
		ac.registerShutdownHook();
	}
}
