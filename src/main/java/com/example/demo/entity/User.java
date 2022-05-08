package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "isAdmin")
    private boolean isAdmin;
}
