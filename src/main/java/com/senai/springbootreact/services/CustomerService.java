package com.senai.springbootreact.services;

import com.senai.springbootreact.models.Category;
import com.senai.springbootreact.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAllCustomer();
    Optional<Customer> getCustomerById(Long id);
    Customer saveCustomer(Customer costumer);
    Customer updateCustomer(Customer costumer);
    // Pode ser igual ao save
    void deleteCustomer(Long id);
}
