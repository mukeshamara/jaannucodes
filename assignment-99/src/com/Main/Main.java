package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Employee;
import com.Service.EmployeeDAO;

public class Main {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
         Employee emp=new Employee("1","janu","java");
		 EmployeeDAO dao=(EmployeeDAO) context.getBean("edao");
		// edao.createTable();
         int status=dao.saveEmployee(emp);
         if(status==1)
        	 System.out.println("successful insertion");
         else
        	 System.out.println("failed insertion");         
	}
}
