package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.TaxService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
		Employee savedEmployee = employeeService.saveEmployeeDetails(employee);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}/tax-deductions")
    public ResponseEntity<Double> calculateTax(@PathVariable String id) {
		Employee employee = employeeRepository.findByEmployeeId(id);
		String employeeId = employee.getEmployeeId();
        if (employeeId != null) {
            double tax = taxService.calculateTax(employee.getSalary());
            return ResponseEntity.ok(tax);
        }else {
        	return ResponseEntity.notFound().build();
        }
    }


}
