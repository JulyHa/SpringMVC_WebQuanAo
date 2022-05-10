package com.example.demo.service.impl;

import com.example.demo.entity.ProductImageEntity;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<ProductImageEntity> getAllImageByProduct(int id) {

        return null;
    }

    @Override
    public List<ProductImageEntity> getAllImage() {
        return imageRepository.findAll();
    }
}
