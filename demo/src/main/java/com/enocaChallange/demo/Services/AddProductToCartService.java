package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Cart;
import com.enocaChallange.demo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddProductToCartService {

    @Autowired
    private CartService cartService;

    public void addProductToCart(Cart cart, Product product) {
        cartService.addProductToCart(cart, product);
    }
}
