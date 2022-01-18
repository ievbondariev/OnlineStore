package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/createProduct")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/product/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/product/deleteProduct")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
    }

    @GetMapping("/product/{id}")

    public Product getById( @PathVariable Long id) {
        return productService.getById(id);
    }

    @GetMapping("/product/allProducts")
    @ResponseBody
    public List<Product> getAll() {
        return productService.getAllProducts();
    }
}
