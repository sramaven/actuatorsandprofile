package com.capgemini.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeeapp.exception.EmployeeNotFoundException;
import com.capgemini.employeeapp.model.EmployeeClass;
import com.capgemini.employeeapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<EmployeeClass> addNewEmployee(@RequestBody EmployeeClass employee){
		return new ResponseEntity<EmployeeClass>(employeeService.addNewEmployee(employee),HttpStatus.OK);
		
	}
	@GetMapping("/{employeeId}")
	public ResponseEntity<EmployeeClass> findEmployeeById(@PathVariable int employeeId) {
     try {
    	 EmployeeClass employee=employeeService.findEmployeeId(employeeId);
    	return new ResponseEntity<EmployeeClass>(employee,HttpStatus.OK); 
     }
     catch(EmployeeNotFoundException ex) {
    	 return new ResponseEntity<EmployeeClass>(HttpStatus.NOT_FOUND);
     }
		
	}
	
	public ResponseEntity<List<EmployeeClass>> findAllEmployees(){
		return new ResponseEntity<List<EmployeeClass>>(employeeService.findAllEmployees(),HttpStatus.OK);
	}

}
