package com.cap.banking.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.banking.dao.Customer;

public interface BankingRepository extends JpaRepository<Customer, Long> {

}
