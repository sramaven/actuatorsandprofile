package com.capgemini.employeeapp.service;

import java.util.List;

import com.capgemini.employeeapp.exception.EmployeeNotFoundException;
import com.capgemini.employeeapp.model.EmployeeClass;

public interface EmployeeService {
	public EmployeeClass addNewEmployee(EmployeeClass employee);
	public EmployeeClass findEmployeeId(int employeeId) throws EmployeeNotFoundException;
	public List<EmployeeClass> findAllEmployees();

}
