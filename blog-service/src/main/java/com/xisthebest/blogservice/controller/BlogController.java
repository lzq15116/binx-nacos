package com.xisthebest.blogservice.controller;

import com.tencentcloudapi.apigateway.v20180808.models.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private ServerProperties serverProperties;


    @GetMapping("/list")
    public String list() {


        return "blog list， port： " + serverProperties.getPort();
    }
}
