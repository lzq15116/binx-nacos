package com.xisthebest.blogservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xisthebest.blogservice.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper extends BaseMapper<Blog> {
}
