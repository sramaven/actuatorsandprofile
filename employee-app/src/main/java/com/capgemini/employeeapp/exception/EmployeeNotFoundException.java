package com.capgemini.employeeapp.exception;

public class EmployeeNotFoundException extends Throwable{
	public EmployeeNotFoundException(String message)
	{
		super(message);
	}

}