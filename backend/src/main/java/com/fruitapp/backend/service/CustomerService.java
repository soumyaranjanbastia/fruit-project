package com.fruitapp.backend.service;

import org.springframework.stereotype.Service;

import com.fruitapp.backend.model.Customer;
import com.fruitapp.backend.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

/**
 * CustomerService
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final ProductService productService;

    public void addCart(String productId) {
        
    }
    public Customer addCustomer(Customer customer){

       return this.customerRepository.save(customer);
    }

    
}