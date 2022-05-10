package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "\"Categories\"")
public class CategoriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "categoryID", nullable = false)
    private int categoryId;
    @Basic
    @Column(name = "categoryName", nullable = false, length = 50)
    private String categoryName;
    @OneToMany(mappedBy = "categoriesByCategoryId")
    private Collection<ProductEntity> productsByCategoryId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
