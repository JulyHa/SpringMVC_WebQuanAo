package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WishList")
public class WishList {
    @Id
    @Column(name = "productID")
    private int productID;

    @Column(name = "customerID")
    private int customerID;

}
