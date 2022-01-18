package com.example.controller;

import com.example.model.Cart;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("cart/createCart")
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.createCart(cart);
    }

    @PutMapping("/cart/updateCart")
    public Cart updateCart(@RequestBody Cart cart) {
        return cartService.updateCart(cart);
    }

    @DeleteMapping("cart/deleteCart")
    public void deleteCart(@RequestBody Cart cart) {
        cartService.deleteCart(cart);
    }

    @GetMapping("cart/{id}")
    public Cart findById(@PathVariable int id) {
        return cartService.getById(id);
    }

    @GetMapping("/cart/allCarts")
    @ResponseBody
    public List<Cart> getAll() {
        return cartService.getAllCarts();
    }

//    @PutMapping("cart/{id}/add/{idProduct}")
//    public Cart addProduct(int id, Long idProduct) {
//        return cartService.addProductToCart(id, idProduct);
    }


