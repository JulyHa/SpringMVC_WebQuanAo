package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "CustomerReviews")
public class CustomerReviews {
    @Id
    @Column(name = "reviewID")
    private int reviewID;

    @Column(name = "customerID")
    private int customerID;

    @Column(name = "productID")
    private int productID;

    @Column(name = "rating")
    private float rating;

    @Column(name = "reviewTitle")
    private String reviewTitle;

    @Column(name = "reviewBody")
    private String reviewBody;

    @Column(name = "reviewDate")
    private Date reviewDate;


}
