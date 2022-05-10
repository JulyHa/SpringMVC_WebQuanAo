package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "\"ProductImage\"")
public class ProductImageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ImageID")
    private int imageId;
    @Basic
    @Column(name = "productID")
    private int productId;
    @Basic
    @Column(name = "ImageUrl", length = 50)
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "productID", referencedColumnName = "productID", insertable = false, updatable = false)
    private ProductEntity productByProductId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
    }
}
