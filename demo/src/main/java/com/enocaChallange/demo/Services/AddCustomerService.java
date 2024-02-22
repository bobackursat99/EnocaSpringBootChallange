package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Customer;
import com.enocaChallange.demo.Repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddCustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public Customer addCustomer(String name, String address) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);
        return customerRepository.save(customer);
    }
}
