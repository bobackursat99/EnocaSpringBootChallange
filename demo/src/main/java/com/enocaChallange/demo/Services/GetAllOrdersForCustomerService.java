package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Customer;
import com.enocaChallange.demo.Entities.Order;
import com.enocaChallange.demo.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllOrdersForCustomerService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrdersForCustomer(Customer customer) {
        return orderRepository.findByCustomer(customer);
    }
}
