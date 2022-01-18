package com.example.service;

import com.example.model.Person;
import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.storage.ProductStorage.productStorageList;
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product createProduct(Product product) {
        Product newProduct = product;
        productStorageList.add(newProduct);
        return newProduct;
    }

    @Override
    public Product updateProduct(Product product) {
        Product newProduct = product;
        newProduct.setId(product.getId());
        newProduct.setName(product.getName());
        newProduct.setPrice(product.getPrice());
        newProduct.setCategory(product.getCategory());
        return product;
    }

    @Override
    public void deleteProduct(Product product) {
        productStorageList.removeIf(product1 -> product1.equals(product.getId()));
    }

    @Override
    public Product getById(Long id) {
        Product product = new Product();
        product.setId(product.getId());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return productStorageList;
    }
}
