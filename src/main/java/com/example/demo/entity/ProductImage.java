package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductImage")
public class ProductImage {
    @Id
    @Column(name = "imageID")
    private int imageID;

    @Column(name = "productID")
    private int productID;

    @Column(name = "imageUrl")
    private String imageUrl;

}
