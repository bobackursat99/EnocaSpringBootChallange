package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Cart;
import com.enocaChallange.demo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveProductFromCartService {

    @Autowired
    private CartService cartService;

    public void removeProductFromCart(Cart cart, Product product) {
        cartService.removeProductFromCart(cart, product);
    }
}