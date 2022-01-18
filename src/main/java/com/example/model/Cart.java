package com.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cart {
    private Integer id;
    private List<Product> products;
    private double sum;


    public  double totalSum (Cart cart, Product product){
        List<Product> products = cart.products;
        double sum = 0;
        return sum + product.getPrice();
    }
}