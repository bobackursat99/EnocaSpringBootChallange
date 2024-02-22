package com.enocaChallange.demo.Repositories;

import com.enocaChallange.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
