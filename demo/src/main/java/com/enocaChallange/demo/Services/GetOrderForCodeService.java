package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Order;
import com.enocaChallange.demo.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetOrderForCodeService {
    @Autowired
    private OrderRepository orderRepository;

    public Order getOrderForCode(String orderCode) {
        return orderRepository.findByOrderCode(orderCode);
    }
}
