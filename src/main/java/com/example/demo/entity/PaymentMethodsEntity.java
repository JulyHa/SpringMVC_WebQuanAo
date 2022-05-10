package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "\"PaymentMethods\"")
public class PaymentMethodsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "paymentID", nullable = false)
    private int paymentId;
    @Basic
    @Column(name = "paymentName", nullable = true, length = 50)
    private String paymentName;
    @OneToMany(mappedBy = "paymentMethodsByPaymentId")
    private Collection<OrdersEntity> ordersByPaymentId;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }


    public Collection<OrdersEntity> getOrdersByPaymentId() {
        return ordersByPaymentId;
    }

    public void setOrdersByPaymentId(Collection<OrdersEntity> ordersByPaymentId) {
        this.ordersByPaymentId = ordersByPaymentId;
    }
}
