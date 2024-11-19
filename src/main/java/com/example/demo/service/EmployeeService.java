package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.repository.EmployeeRepository;

import com.example.demo.model.*;



public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployeeDetails(Employee employeeDet) {
		return employeeRepository.save(employeeDet);
	}
	

}
