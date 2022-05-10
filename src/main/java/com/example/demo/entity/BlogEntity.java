package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "\"Blog\"")
public class BlogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "blogID", nullable = false)
    private int blogId;
    @Basic
    @Column(name = "blogTitle", nullable = true, length = 50)
    private String blogTitle;
    @Basic
    @Column(name = "blogBody", nullable = true, length = 50)
    private String blogBody;
    @Basic
    @Column(name = "blogDate", nullable = true)
    private Date blogDate;
    @Basic
    @Column(name = "userName", nullable = true, length = 50)
    private String userName;
    @Basic
    @Column(name = "tags", nullable = true, length = 50)
    private String tags;
    @ManyToOne
    @JoinColumn(name = "userName", referencedColumnName = "userName", insertable = false, updatable = false)
    private UserEntity userByUserName;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogBody() {
        return blogBody;
    }

    public void setBlogBody(String blogBody) {
        this.blogBody = blogBody;
    }

    public Date getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Date blogDate) {
        this.blogDate = blogDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }


    public UserEntity getUserByUserName() {
        return userByUserName;
    }

    public void setUserByUserName(UserEntity userByUserName) {
        this.userByUserName = userByUserName;
    }
}
