package com.codegym.shoppingcart.service;

import com.codegym.shoppingcart.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
//    void save(Product product);
//    void update(int id, Product product);
//    void delete(int id);
}
