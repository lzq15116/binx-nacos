package com.xisthebest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@TableName("blog")
@Data
@Builder
public class Blog {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String content;

}
