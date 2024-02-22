package com.enocaChallange.demo.Repositories;

import com.enocaChallange.demo.Entities.Customer;
import com.enocaChallange.demo.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderCode(String orderCode);

    List<Order> findByCustomer(Customer customer);
}
