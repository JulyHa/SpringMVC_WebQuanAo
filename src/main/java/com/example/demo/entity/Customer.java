package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "customerID")
    private int customerID;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerPhone")
    private String customerPhone;

    @Column(name = "customerEmail")
    private String customerEmail;

    @Column(name = "userName")
    private String userName;
}
