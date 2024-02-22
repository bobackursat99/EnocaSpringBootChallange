package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Customer;
import com.enocaChallange.demo.Entities.Order;
import com.enocaChallange.demo.Entities.Product;
import com.enocaChallange.demo.Repositories.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public Order placeOrder(Customer customer, List<Product> products) {
        Order order = new Order();
        order.setCustomer(customer);
        order.setProducts(products);
        double totalPrice = calculateTotalPrice(products);
        order.setTotalPrice(totalPrice);
        return orderRepository.save(order);
    }

    private double calculateTotalPrice(List<Product> products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }
}
