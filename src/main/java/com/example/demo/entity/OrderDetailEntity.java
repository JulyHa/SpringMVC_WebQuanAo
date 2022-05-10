package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "\"OrderDetail\"")
public class OrderDetailEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "detailID", nullable = false)
    private int detailId;
    @Basic
    @Column(name = "orderID", nullable = false)
    private int orderId;
    @Basic
    @Column(name = "productID", nullable = false)
    private int productId;
    @Basic
    @Column(name = "quantityOrder", nullable = true)
    private int quantityOrder;
    @Basic
    @Column(name = "total", nullable = true)
    private int total;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderID", insertable = false, updatable = false)
    private OrdersEntity ordersByOrderId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productID", insertable = false, updatable = false)
    private ProductEntity productByProductId;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public OrdersEntity getOrdersByOrderId() {
        return ordersByOrderId;
    }

    public void setOrdersByOrderId(OrdersEntity ordersByOrderId) {
        this.ordersByOrderId = ordersByOrderId;
    }

    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
    }
}
