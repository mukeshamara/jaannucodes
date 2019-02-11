package com.example;
import com.model.Bank;


public class BankImpl {
public void deposit(Bank b,int amt)
{
	System.out.println("New deposit");
	System.out.println((b.getAmt()+amt));
}
}
