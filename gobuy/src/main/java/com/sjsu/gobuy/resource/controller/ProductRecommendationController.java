package com.sjsu.gobuy.resource.controller;

import com.sjsu.gobuy.domain.ProductRecommendation;
import com.sjsu.gobuy.service.ProductRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("gobuy")
public class ProductRecommendationController {

    public static final String RECOMMENDATIONS = "/recommendations";

    @Autowired
    private ProductRecommendationService productRecommendationService;

    @RequestMapping(method = GET, path = RECOMMENDATIONS)
    public HttpEntity<ProductRecommendation> getRecommendations(@RequestParam String twitterHandle,
                                                                @RequestParam String productName) {
        ProductRecommendation productRecommendation = productRecommendationService.getProductRecommendationFor(
                twitterHandle, productName);

        productRecommendation.add(aLinkOf(twitterHandle, productName));
        return new ResponseEntity<>(productRecommendation, OK);
    }

    private Link aLinkOf(@RequestParam String twitterHandle, @RequestParam String productName) {
        return linkTo(methodOn(ProductRecommendationController.class).getRecommendations(twitterHandle, productName))
                .withSelfRel();
    }

}

