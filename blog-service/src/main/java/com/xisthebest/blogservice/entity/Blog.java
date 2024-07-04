package com.xisthebest.blogservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("blog")
@Data
public class Blog {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String content;

}
