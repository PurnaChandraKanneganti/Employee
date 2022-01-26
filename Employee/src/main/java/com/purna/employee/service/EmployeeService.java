package com.purna.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.purna.employee.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> getEmployeeDetails();
	
}
