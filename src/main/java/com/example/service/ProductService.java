package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Product product);

    Product getById(Long id);

    List<Product> getAllProducts();

}
