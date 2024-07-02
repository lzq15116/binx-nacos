package com.xisthebest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/postBlog")
    public String postBlog() {

        String blogServiceUrl = "http://blog-service";

        return restTemplate.getForObject(blogServiceUrl + "/blog/list", String.class);

    }
}
