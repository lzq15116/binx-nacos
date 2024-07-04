package com.xisthebest.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("blog-service")
public interface BlogServiceClient {

    @GetMapping("blog/list/{id}")
    String list(@PathVariable("id") String id);

}
