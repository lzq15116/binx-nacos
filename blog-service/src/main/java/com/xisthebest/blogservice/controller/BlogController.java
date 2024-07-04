package com.xisthebest.blogservice.controller;

import com.xisthebest.blogservice.entity.Blog;
import com.xisthebest.blogservice.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private ServerProperties serverProperties;

    @Autowired
    private BlogService blogService;


    @GetMapping("/list/{id}")
    public String list(@PathVariable("id") String id) {

        Blog blog = blogService.getById(id);
        String port =  "blog list， port： " + serverProperties.getPort();
        String blogString = ",blog is :" + blog;
        return blogString + port;

    }
}
