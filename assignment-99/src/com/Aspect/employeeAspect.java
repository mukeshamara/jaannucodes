package com.Aspect;

import org.aspectj.lang.JoinPoint;

import com.Model.Employee;

public class employeeAspect {

	public void validateEmployee(JoinPoint joinpoint) {
	        System.out.println("Employee validation");

	}
}
