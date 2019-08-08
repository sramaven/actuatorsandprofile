
package com.capgemini.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.employeeapp.model.EmployeeClass;

public interface EmployeeRepository extends JpaRepository<EmployeeClass, Integer>{
	
} 
 
