package com.example.service;

import com.example.model.Cart;
import com.example.model.Product;

import java.util.List;

public interface CartService {
    Cart createCart(Cart cart);

    Cart updateCart(Cart cart);

    void deleteCart(Cart cart);

    Cart getById(int id);

    List<Cart> getAllCarts();

    Cart addProductToCart(int id, Long idProduct);


    double getTotalSum(Cart cart, Product product);
}
