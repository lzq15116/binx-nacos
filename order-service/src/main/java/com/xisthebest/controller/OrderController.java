package com.xisthebest.controller;

import com.xisthebest.entity.Orders;
import com.xisthebest.feignClient.BlogServiceClient;
import com.xisthebest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.crypto.Data;
import java.math.BigDecimal;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BlogServiceClient blogServiceClient;

    @Autowired
    private OrderService orderService;

    @GetMapping("/postBlog")
    public String postBlog() {

        String blogServiceUrl = "http://blog-service";

        return restTemplate.getForObject(blogServiceUrl + "/blog/list", String.class);

    }

    @GetMapping("/getBlogById/{id}")
    public String getBlogById(@PathVariable("id") String id) {

        return blogServiceClient.list(id);

    }

//    amount      decimal(10, 2) null,
//    create_time bigint         null

    @PostMapping("/saveOrderBlog")
    public String saveOrderBlog(String amount,Long createTime,String blogId,String blogContent) {

        return orderService.saveOrderBlog(amount,createTime,blogId,blogContent);

    }


}
