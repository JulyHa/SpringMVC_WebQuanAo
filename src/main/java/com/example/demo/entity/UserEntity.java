package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "\"User\"")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userName", nullable = false, length = 50)
    private String userName;
    @Basic
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @Basic
    @Column(name = "isAdmin", nullable = false)
    private boolean isAdmin;
    @OneToMany(mappedBy = "userByUserName")
    private Collection<BlogEntity> blogsByUserName;
    @OneToMany(mappedBy = "userByUserName")
    private Collection<CustomerEntity> customersByUserName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


    public Collection<BlogEntity> getBlogsByUserName() {
        return blogsByUserName;
    }

    public void setBlogsByUserName(Collection<BlogEntity> blogsByUserName) {
        this.blogsByUserName = blogsByUserName;
    }

    public Collection<CustomerEntity> getCustomersByUserName() {
        return customersByUserName;
    }

    public void setCustomersByUserName(Collection<CustomerEntity> customersByUserName) {
        this.customersByUserName = customersByUserName;
    }
}
