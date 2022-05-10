package com.example.demo.service;

import com.example.demo.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    public List<ProductEntity> getListProduct();
    public ProductEntity getProduct(int id);
}
