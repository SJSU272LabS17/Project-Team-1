package com.sjsu.gobuy.util;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.asList;

@Component
public class ProductDictionary {

    private Set<String> brands = new HashSet<>();
    private Map<String, List<String>> products = new HashMap<>();

    @PostConstruct
    public void initialize() {
        populateBrands();
        populateProducts();
    }

    public Set<String> getBrands() {
        return brands;
    }

    public Map<String, List<String>> getProducts() {
        return products;
    }

    private void populateBrands() {
        brands.add("Apple");
        brands.add("Samsung");
        brands.add("Microsoft");
        brands.add("Sony");
        brands.add("Nokia");
        brands.add("Blackberry");
        brands.add("HTC");
    }

    private void populateProducts() {
        products.put("phone", asList("Xperia", "iPhone", "Galaxy", "Note", "Droid", "Razr", "Desire", "One X"));
    }

}
