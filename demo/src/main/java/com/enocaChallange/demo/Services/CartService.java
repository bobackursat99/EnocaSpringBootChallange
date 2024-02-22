package com.enocaChallange.demo.Services;

import com.enocaChallange.demo.Entities.Cart;
import com.enocaChallange.demo.Entities.Customer;
import com.enocaChallange.demo.Entities.Product;
import com.enocaChallange.demo.Repositories.CartRepository;
import com.enocaChallange.demo.Repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productService;

    @Transactional
    public Cart createCart(Customer customer) {
        Cart cart = new Cart();
        cart.setCustomer(customer);
        return cartRepository.save(cart);
    }

    @Transactional
    public void addProductToCart(Cart cart, Product product) {
        List<Product> products = cart.getProducts();
        products.add(product);
        cart.setProducts(products);
        updateCart(cart);
    }

    @Transactional
    public void removeProductFromCart(Cart cart, Product product) {
        List<Product> products = cart.getProducts();
        products.remove(product);
        cart.setProducts(products);
        updateCart(cart);
    }

    @Transactional
    public void updateCart(Cart cart) {
        double totalPrice = 0;
        for (Product product : cart.getProducts()) {
            totalPrice += product.getProductPrice();
        }
        cart.setTotalPrice(totalPrice);
        cartRepository.save(cart);
    }

    @Transactional
    public void emptyCart(Cart cart) {
        cart.setProducts(null);
        cart.setTotalPrice(0);
        cartRepository.save(cart);
    }

}
