package com.capgemini.employeeapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity	
public class EmployeeClass {
@Id
private int employeeId;
private String employeeName;
private String employeeDepartment;
private double employeeSalary;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}

}
