package com.aggrandizer.swapNswank.profileservice.controller;

import com.aggrandizer.swapNswank.commons.model.Clothe;
import com.aggrandizer.swapNswank.commons.model.Customer;
import com.aggrandizer.swapNswank.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;


    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);

    }


}
