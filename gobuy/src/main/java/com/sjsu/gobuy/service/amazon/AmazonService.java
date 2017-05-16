package com.sjsu.gobuy.service.amazon;

import com.sjsu.gobuy.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonService {

    @Autowired
    private AmazonStubClient amazonClient;

    public List<Product> listProductsFor(String productName) {
        return amazonClient.listProductsFor(productName);
    }

}
