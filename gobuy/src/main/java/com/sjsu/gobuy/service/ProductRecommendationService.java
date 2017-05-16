package com.sjsu.gobuy.service;

import com.sjsu.gobuy.domain.ProductRecommendation;
import com.sjsu.gobuy.service.amazon.AmazonService;
import com.sjsu.gobuy.service.twitter.TwitterService;
import com.sjsu.gobuy.util.ProductDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRecommendationService {

    @Autowired
    private ProductDictionary productDictionary;
    @Autowired
    private TwitterService twitterService;
    @Autowired
    private AmazonService amazonService;

    public ProductRecommendation getProductRecommendationFor(String twitterHandle, String productName) {
        ProductRecommendation productRecommendation = new ProductRecommendation();
        List<String> favorites = twitterService.listFavorites(twitterHandle, 5);

        for (String favorite : favorites) {
            if (isBrand(favorite) || isProduct(productName, favorite)) {
                productRecommendation.setProducts(amazonService.listProductsFor(productName));
                break;
            }
        }

        return productRecommendation;
    }

    private boolean isBrand(String favorite) {
        for (String brand : productDictionary.getBrands()) {
            if (favorite.contains(brand)) {
                return true;
            }
        }
        return false;
    }

    private boolean isProduct(String favorite, String productName) {
        for (String product : productDictionary.getProducts().keySet()) {
            if (favorite.contains(product) || favorite.contains(productName)) {
                return true;
            }
        }
        return false;
    }

}
