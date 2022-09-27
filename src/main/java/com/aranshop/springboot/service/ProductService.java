package com.aranshop.springboot.service;

import com.aranshop.springboot.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
