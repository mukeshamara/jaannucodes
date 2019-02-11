package com.Main;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Employee;
import com.Model.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Student aimpl = context.getBean("student",Student.class);
	    aimpl.show();
	    Employee ee= (Employee) context.getBean("employee");
	    ee.show();    
	    
	    context.registerShutdownHook();
  	}
}