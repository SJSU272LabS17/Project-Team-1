package com.sjsu.gobuy.client;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class RestTemplate {

    public static final int CONNECT_TIMEOUT = 5000;

    private org.springframework.web.client.RestTemplate restTemplate;

    @PostConstruct
    public void initialize() {
        restTemplate = new org.springframework.web.client.RestTemplate(clientHttpRequestFactory());
        restTemplate.setInterceptors(requestInterceptor());
    }

    public org.springframework.web.client.RestTemplate getInstance() {
        return restTemplate;
    }

    private ClientHttpRequestFactory clientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(CONNECT_TIMEOUT);
        return factory;
    }

    private List<ClientHttpRequestInterceptor> requestInterceptor() {
        List<ClientHttpRequestInterceptor> requestInterceptor = new ArrayList<>();
        requestInterceptor.add(new ClientHttpRequestInterceptorImpl());
        return requestInterceptor;
    }

}
