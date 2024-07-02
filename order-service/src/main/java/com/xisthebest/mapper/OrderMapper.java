package com.xisthebest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xisthebest.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
