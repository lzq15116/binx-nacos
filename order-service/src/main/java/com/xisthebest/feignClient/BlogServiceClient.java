package com.xisthebest.feignClient;

import com.xisthebest.entity.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("blog-service")
public interface BlogServiceClient {

    @GetMapping("blog/list/{id}")
    String list(@PathVariable("id") String id);

    @PostMapping("/blog/save")
    String save(@RequestBody Blog blog);

}
