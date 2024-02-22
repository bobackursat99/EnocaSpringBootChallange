package com.enocaChallange.demo.Repositories;

import com.enocaChallange.demo.Entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
