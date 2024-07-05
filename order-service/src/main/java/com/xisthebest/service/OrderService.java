package com.xisthebest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xisthebest.entity.Orders;

public interface OrderService extends IService<Orders> {
    String saveOrderBlog(String amount, Long createTime, String blogId, String blogContent);
}
