/**
 * 
 */
package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

import jakarta.validation.constraints.*;

@Entity
public class PhoneNumbers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

       
    @NotBlank(message = "Phone Number is mandatory")
    private String phoneNumber;
    
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employeeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}
    
    

    
}