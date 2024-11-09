package com.murali.emp.mgmt.system.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.emp.mgmt.system.model.Employee;

@RestController
public class EmployeeService {
	
	
	@GetMapping("/readEmp")
	public Employee readEmployee( ) {
		
		Employee employee = new Employee("Murali", 01, "murali@gmail.com");
		
		return employee;
	}

}
