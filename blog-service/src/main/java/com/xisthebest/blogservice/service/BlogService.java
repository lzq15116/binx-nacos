package com.xisthebest.blogservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xisthebest.blogservice.entity.Blog;

public interface BlogService extends IService<Blog> {
    void iSave(Blog blog);

}
