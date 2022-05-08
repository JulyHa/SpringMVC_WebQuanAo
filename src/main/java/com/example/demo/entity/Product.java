package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(name  = "productID")
    private int productID;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productPrice")
    private float productPrice;

    @Column(name = "productQuantity")
    private int productQuantity;

    @Column(name = "productSize")
    private String productSize;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "productRating")
    private float productRating;

    @Column(name = "categoryID")
    private int categoryID;

    @Column(name = "amountSold")
    private int amountSold;

    @Column(name = "createTime")
    private Date createTime;

}
