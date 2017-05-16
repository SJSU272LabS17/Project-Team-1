package com.sjsu.gobuy.service.twitter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class TwitterClient {

    @Value("${api.twitter.secrets.consumerKey}")
    private String consumerKey;
    @Value("${api.twitter.secrets.consumerSecret}")
    private String consumerSecret;
    @Value("${api.twitter.secrets.accessToken}")
    private String accessToken;
    @Value("${api.twitter.secrets.accessTokenSecret}")
    private String accessTokenSecret;

    private TwitterTemplate twitterTemplate;

    @PostConstruct
    public void initialize() {
        twitterTemplate = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }

    public List<Tweet> listFavorites(String screenName, int count) {
        return twitterTemplate.timelineOperations().getFavorites(screenName, count);
    }

}
