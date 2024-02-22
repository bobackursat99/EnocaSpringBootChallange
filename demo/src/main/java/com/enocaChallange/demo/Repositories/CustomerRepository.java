package com.enocaChallange.demo.Repositories;

import com.enocaChallange.demo.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
