package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.BankImpl;
import com.model.Bank;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("app.xml"); 
		Bank b=new Bank("joint account",50000);
        BankImpl im=(BankImpl) ac.getBean("bankimpl");
		im.deposit(b,20000);		
	}
}
