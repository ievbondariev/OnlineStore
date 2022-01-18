package com.example.service;

import com.example.model.Cart;
import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.storage.CartStorage.cartStorageList;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public Cart createCart(Cart cart) {
        cartStorageList.add(cart);
        return cart;
    }

    @Override
    public Cart updateCart(Cart cart) {
        Cart newCart = cart;
        newCart.setId(cart.getId());
        newCart.setProducts(cart.getProducts());
        newCart.setSum(cart.getSum());
        return cart;
    }

    @Override
    public void deleteCart(Cart cart) {
        cartStorageList.removeIf(cart1 -> cart1.getId().equals(cart.getId()));
    }

    @Override
    public Cart getById(int id) {
        Cart cart = new Cart();
        cart.setId(cart.getId());
        return cart;
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartStorageList;
    }


    @Override
    public Cart addProductToCart(int id, Long idProduct) {
        Cart cart = new Cart();
        Product product = new Product();
        return cart;
    }

    @Override
    public  double getTotalSum (Cart cart, Product product){
        List<Product> products = cart.getProducts();
        double sum = 0;
        return sum + product.getPrice();
    }
}
