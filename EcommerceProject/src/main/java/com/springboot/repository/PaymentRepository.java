package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

}
