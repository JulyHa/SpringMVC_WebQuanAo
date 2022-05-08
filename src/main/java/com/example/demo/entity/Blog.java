package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Blog")
public class Blog {
    @Id
    @Column(name = "blogID")
    private int blogID ;

    @Column(name = "blogTitle")
    private String blogTitle;

    @Column(name = "blogBody")
    private String blogBody;

    @Column(name = "blogDate")
    private Date blogDate;

    @Column(name = "userName")
    private String userName;

    @Column(name = "tags")
    private String tags;

}
