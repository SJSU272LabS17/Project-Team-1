package com.sjsu.gobuy.client;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON;

public class ClientHttpRequestInterceptorImpl implements ClientHttpRequestInterceptor {

    public static final String CONTENT_TYPE = "Content-Type";

    private String headerName;
    private String headerValue;

    public ClientHttpRequestInterceptorImpl() {
        this(CONTENT_TYPE, APPLICATION_JSON.toString());
    }

    public ClientHttpRequestInterceptorImpl(String headerName, String headerValue) {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        HttpRequest wrapper = new HttpRequestWrapper(request);
        wrapper.getHeaders().set(headerName, headerValue);
        return execution.execute(wrapper, body);
    }

}
