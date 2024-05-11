package com.aggrandizer.swapNswank.profileservice.service;

import com.aggrandizer.swapNswank.commons.model.Customer;
import com.aggrandizer.swapNswank.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
