package com.capgemini.employeeapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeapp.exception.EmployeeNotFoundException;
import com.capgemini.employeeapp.model.EmployeeClass;
import com.capgemini.employeeapp.repository.EmployeeRepository;
import com.capgemini.employeeapp.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeClass addNewEmployee(EmployeeClass employee) {
		// TODO Auto-generated method stub
	       return employeeRepository.save(employee);
	       
	}

	@Override
	public EmployeeClass findEmployeeId(int employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stu
		Optional<EmployeeClass> data=employeeRepository.findById(employeeId);
		if(data.isPresent())
		   return data.get();
		throw new EmployeeNotFoundException("Employee ID not found.");
	}

	@Override
	public List<EmployeeClass> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
