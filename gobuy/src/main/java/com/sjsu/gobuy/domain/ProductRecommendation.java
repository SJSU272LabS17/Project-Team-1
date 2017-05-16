package com.sjsu.gobuy.domain;

import org.springframework.hateoas.ResourceSupport;

import java.util.List;

public class ProductRecommendation extends ResourceSupport {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
