package com.org.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{

    private Boolean isPrime;
    private String name;
    private String description;
    private Double price;
    private Category category;
    private String imageUrl;

}
