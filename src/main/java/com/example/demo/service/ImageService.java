package com.example.demo.service;

import com.example.demo.entity.ProductImageEntity;

import java.util.List;

public interface ImageService {
    List<ProductImageEntity> getAllImageByProduct(int id);

    List<ProductImageEntity> getAllImage();
}
