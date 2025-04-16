package com.senai.springbootreact.repositories;

import com.senai.springbootreact.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
