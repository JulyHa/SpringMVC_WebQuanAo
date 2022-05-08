package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PaymentMethod")
public class PaymentMethod {
    @Id
    @Column(name = "paymentID")
    private int paymentID;

    @Column(name = "paymentName")
    private String paymentName;

}
