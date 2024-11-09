package com.murali.emp.mgmt.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.murali.emp.mgmt.system.model.Employee;

@RestController
public class EmployeeService {

	@GetMapping("/readEmp")
	public Employee readEmployee() {

		Employee employee = new Employee("Murali", 01, "murali@gmail.com");

		return employee;
	}

	@GetMapping("/readEmployees")
	public List<Employee> readAllEmployee() {

		Employee employee1 = new Employee("Murali", 01, "murali@gmail.com");
		Employee employee2 = new Employee("Kumaran", 02, "kumaran@gmail.com");
		Employee employee3 = new Employee("nila", 03, "nila@gmail.com");
		Employee employee4 = new Employee("kavin", 04, "kavin@gmail.com");
		Employee employee5 = new Employee("jeeva", 05, "jeeva@gmail.com");

		List<Employee> employees = new ArrayList();
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		return employees ;
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee ) {
		
		return employee;
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployee(@RequestBody List<Employee> employees) {
		
		
		
		return employees;
	}

}
