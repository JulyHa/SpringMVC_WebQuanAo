package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @Column(name = "orderID")
    private int orderID;

    @Column(name = "createTime")
    private Date createTime;

    @Column(name = "customerID")
    private int customerID;

    @Column(name = "isPay")
    private boolean isPay;

    @Column(name = "paymentID")
    private int paymentID;
}
