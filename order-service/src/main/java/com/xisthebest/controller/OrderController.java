package com.xisthebest.controller;

import com.xisthebest.feignClient.BlogServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BlogServiceClient blogServiceClient;

    @GetMapping("/postBlog")
    public String postBlog() {

        String blogServiceUrl = "http://blog-service";

        return restTemplate.getForObject(blogServiceUrl + "/blog/list", String.class);

    }

    @GetMapping("/getBlogById/{id}")
    public String getBlogById(@PathVariable("id") String id) {

        return blogServiceClient.list(id);

    }


}
