package com.xisthebest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xisthebest.entity.Blog;
import com.xisthebest.entity.Orders;
import com.xisthebest.feignClient.BlogServiceClient;
import com.xisthebest.mapper.OrderMapper;
import com.xisthebest.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Orders> implements OrderService {

    @Autowired
    private BlogServiceClient blogServiceClient;


    @Override
    @GlobalTransactional
    public String saveOrderBlog(String amount, Long createTime, String blogId, String blogContent) {

        Orders orders = Orders.builder()
                .amount(BigDecimal.valueOf(Double.parseDouble(amount)))
                .createTime(createTime).build();

        Blog blog = Blog.builder()
                .content(blogContent).build();

        save(orders);

        blogServiceClient.save(blog);


        return "true";


    }
}
