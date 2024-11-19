package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PhoneNumbers;

public interface PhoneNumbersRepository extends JpaRepository<PhoneNumbers,Long> {

}
