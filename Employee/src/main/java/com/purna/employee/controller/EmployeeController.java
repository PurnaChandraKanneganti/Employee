package com.purna.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.purna.employee.entity.Employee;
import com.purna.employee.model.EmployeeModel;
import com.purna.employee.repository.EmployeeRepository;
import com.purna.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService empSer;

	@RequestMapping(value = "/getemployee",method = RequestMethod.POST)
	public List<Employee> getEmployee() {
		return empSer.getEmployeeDetails();
	}
}
