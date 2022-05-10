package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int id;
    private String name;
    private float price;
    private int quantity;
    private String size;
    private String description;
    private float rating;
    private int id_category;
    private int amount_sold;
    private Date create_time;
    private boolean is_delete;
    private String url_img;
}
