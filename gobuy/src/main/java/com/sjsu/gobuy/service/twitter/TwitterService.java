package com.sjsu.gobuy.service.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class TwitterService {

    @Autowired
    private TwitterClient twitterClient;

    public List<String> listFavorites(String screenName, int count) {
        List<Tweet> favoriteTweets = twitterClient.listFavorites(screenName, count);

        return favoriteTweets.stream().map(Tweet::getText).collect(toList());
    }

}
