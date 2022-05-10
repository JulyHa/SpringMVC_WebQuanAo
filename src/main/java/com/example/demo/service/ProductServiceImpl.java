package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> getListProduct() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getProduct(int id) {
        return productRepository.getById(id);
    }
}
