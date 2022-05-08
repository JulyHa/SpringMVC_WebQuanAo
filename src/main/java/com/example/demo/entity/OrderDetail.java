package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderDetail {
    @Id
    @Column(name = "orderID")
    private int orderID;

    @Column(name = "productID")
    private int productID;

    @Column(name = "quantityOrder")
    private int quantityOrder;

    @Column(name = "total")
    private double total;
}
