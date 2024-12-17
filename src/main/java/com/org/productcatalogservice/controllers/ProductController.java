package com.org.productcatalogservice.controllers;

import com.org.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        Product product=new Product();
        product.setId(2L);
        product.setDescription("This is a product");
        List<Product> products = new ArrayList();
        products.add(product);
        return products;
    }
    
}
