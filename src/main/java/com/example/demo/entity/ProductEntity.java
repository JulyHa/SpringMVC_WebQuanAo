package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "\"Product\"")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productID", nullable = false)
    private int productId;
    @Basic
    @Column(name = "productName", nullable = false, length = 100)
    private String productName;
    @Basic
    @Column(name = "productPrice", nullable = false, precision = 0)
    private double productPrice;
    @Basic
    @Column(name = "productQuantity", nullable = false)
    private int productQuantity;
    @Basic
    @Column(name = "productSize", nullable = false, length = 5)
    private String productSize;
    @Basic
    @Column(name = "productDescription", nullable = false, length = 200)
    private String productDescription;
    @Basic
    @Column(name = "productRating", nullable = false, precision = 0)
    private double productRating;
    @Basic
    @Column(name = "categoryID", nullable = false)
    private int categoryId;
    @Basic
    @Column(name = "amountSold", nullable = false)
    private int amountSold;
    @Basic
    @Column(name = "createTime", nullable = false)
    private Date createTime;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<CustomerReviewsEntity> customerReviewsByProductId;
    @OneToMany(mappedBy = "productByProductId")//(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "orderID", nullable = false)
    private List<OrderDetailEntity> detailEntities;
    @ManyToOne
    @JoinColumn(name = "categoryID", referencedColumnName = "categoryID", nullable = false, insertable = false, updatable = false)
    private CategoriesEntity categoriesByCategoryId;
    @OneToMany(mappedBy = "productByProductId")
    private List<ProductImageEntity> productImagesByProductId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<WishListEntity> wishListsByProductId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Collection<CustomerReviewsEntity> getCustomerReviewsByProductId() {
        return customerReviewsByProductId;
    }

    public void setCustomerReviewsByProductId(Collection<CustomerReviewsEntity> customerReviewsByProductId) {
        this.customerReviewsByProductId = customerReviewsByProductId;
    }

    public List<OrderDetailEntity> getOrderDetailsByProductId() {
        return detailEntities;
    }

    public void setOrderDetailsByProductId(List<OrderDetailEntity> orderDetailsByProductId) {
        this.detailEntities = orderDetailsByProductId;
    }

    public CategoriesEntity getCategoriesByCategoryId() {
        return categoriesByCategoryId;
    }

    public void setCategoriesByCategoryId(CategoriesEntity categoriesByCategoryId) {
        this.categoriesByCategoryId = categoriesByCategoryId;
    }

    public Collection<ProductImageEntity> getProductImagesByProductId() {
        return productImagesByProductId;
    }

    public void setProductImagesByProductId(List<ProductImageEntity> productImagesByProductId) {
        this.productImagesByProductId = productImagesByProductId;
    }

    public Collection<WishListEntity> getWishListsByProductId() {
        return wishListsByProductId;
    }

    public void setWishListsByProductId(Collection<WishListEntity> wishListsByProductId) {
        this.wishListsByProductId = wishListsByProductId;
    }
}
