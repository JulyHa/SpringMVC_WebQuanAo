package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "\"Customer\"")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customerID", nullable = false)
    private int customerId;
    @Basic
    @Column(name = "customerName", nullable = false, length = 100)
    private String customerName;
    @Basic
    @Column(name = "customerPhone", nullable = false, length = 15)
    private String customerPhone;
    @Basic
    @Column(name = "customerEmail", nullable = true, length = 100)
    private String customerEmail;
    @Basic
    @Column(name = "userName", nullable = false, length = 50)
    private String userName;
    @ManyToOne
    @JoinColumn(name = "userName", referencedColumnName = "userName", nullable = false, insertable = false, updatable = false)
    private UserEntity userByUserName;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<CustomerReviewsEntity> customerReviewsByCustomerId;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<WishListEntity> wishListsByCustomerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public UserEntity getUserByUserName() {
        return userByUserName;
    }

    public void setUserByUserName(UserEntity userByUserName) {
        this.userByUserName = userByUserName;
    }

    public Collection<CustomerReviewsEntity> getCustomerReviewsByCustomerId() {
        return customerReviewsByCustomerId;
    }

    public void setCustomerReviewsByCustomerId(Collection<CustomerReviewsEntity> customerReviewsByCustomerId) {
        this.customerReviewsByCustomerId = customerReviewsByCustomerId;
    }

    public Collection<WishListEntity> getWishListsByCustomerId() {
        return wishListsByCustomerId;
    }

    public void setWishListsByCustomerId(Collection<WishListEntity> wishListsByCustomerId) {
        this.wishListsByCustomerId = wishListsByCustomerId;
    }
}
