package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	// Custom query to find Employee by employeeId
    Employee findByEmployeeId(String employeeId);
}
