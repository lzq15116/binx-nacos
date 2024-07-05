package com.xisthebest.blogservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xisthebest.blogservice.entity.Blog;
import com.xisthebest.blogservice.mapper.BlogMapper;
import com.xisthebest.blogservice.service.BlogService;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    @Override
    public void iSave(Blog blog) {
//        System.out.println(1/0);
        save(blog);
    }
}
