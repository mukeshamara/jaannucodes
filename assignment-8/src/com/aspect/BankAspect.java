package com.aspect;

import org.aspectj.lang.JoinPoint;

public class BankAspect {
public void validateCard(JoinPoint joinpoint)
{
	System.out.println("Card validation 1");
}
public void validateCard1(JoinPoint joinpoint)
{
	System.out.println("Card validation 2");
}
}
