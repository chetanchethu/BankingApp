package com.cap.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.banking.model.Customer;

public interface BankingRepository extends JpaRepository<Customer, Long> {

}
