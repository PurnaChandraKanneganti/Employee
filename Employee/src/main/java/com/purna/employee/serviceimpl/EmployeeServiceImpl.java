package com.purna.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.purna.employee.entity.Employee;
import com.purna.employee.repository.EmployeeRepository;
import com.purna.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	
	@Override
	public List<Employee> getEmployeeDetails() {
		// TODO Auto-generated method stub
		
//		List<Employee> findAll = emprepo.findAll();
		
//		EmployeeModel employeeModel = new EmployeeModel();
//		employeeModel.setId(1);
//		employeeModel.setName("Purush");
//		employeeModel.setDesignation("Nothing");
		
		return emprepo.findAll();
	}

}
