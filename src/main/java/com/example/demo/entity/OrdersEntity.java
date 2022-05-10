package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "\"Orders\"")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderID", nullable = false)
    private int orderId;
    @Basic
    @Column(name = "createTime", nullable = true)
    private Date createTime;
    @Basic
    @Column(name = "customerID", nullable = true)
    private Integer customerId;
    @Basic
    @Column(name = "isPay", nullable = true)
    private Boolean isPay;
    @Basic
    @Column(name = "paymentID", nullable = true)
    private Integer paymentID;
    @OneToMany(mappedBy = "ordersByOrderId") //(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "orderID", nullable = false)
    private List<OrderDetailEntity> orderDetailsByOrderId;
    @ManyToOne
    @JoinColumn(name = "paymentID", referencedColumnName = "paymentID", insertable = false, updatable = false)
    private PaymentMethodsEntity paymentMethodsByPaymentId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

    public Integer getPaymentId() {
        return paymentID;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentID = paymentId;
    }


    public List<OrderDetailEntity> getOrderDetailsByOrderId() {
        return orderDetailsByOrderId;
    }

    public void setOrderDetailsByOrderId(List<OrderDetailEntity> orderDetailsByOrderId) {
        this.orderDetailsByOrderId = orderDetailsByOrderId;
    }

    public PaymentMethodsEntity getPaymentMethodsByPaymentId() {
        return paymentMethodsByPaymentId;
    }

    public void setPaymentMethodsByPaymentId(PaymentMethodsEntity paymentMethodsByPaymentId) {
        this.paymentMethodsByPaymentId = paymentMethodsByPaymentId;
    }
}
