package com.sjsu.gobuy.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.springframework.http.HttpMethod.POST;

@Component
public class RestClient {

    @Autowired
    private RestTemplate restTemplate;

    public <T> ResponseEntity<T> get(String url, Class<T> responseType) {
        return restTemplate.getInstance().getForEntity(url, responseType);
    }

    public <T> ResponseEntity<T> get(String url, Class<T> responseType, Map<String, ?> urlVariables) {
        return restTemplate.getInstance().getForEntity(url, responseType, urlVariables);
    }

    public <T> ResponseEntity<T> post(String url, String requestPayload, Class<T> responseType) {
        return execute(url, POST, requestPayload, responseType);
    }

    public <T> ResponseEntity<T> execute(String url, HttpMethod method, String requestPayload, Class<T> responseType) {
        return restTemplate.getInstance().exchange(url, method, new HttpEntity(requestPayload), responseType);
    }

}
