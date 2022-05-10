package com.example.demo.repository;

import com.example.demo.entity.ProductImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;

public interface ImageRepository extends JpaRepository<ProductImageEntity, Integer> {

}
