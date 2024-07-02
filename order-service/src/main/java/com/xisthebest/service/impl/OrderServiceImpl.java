package com.xisthebest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xisthebest.entity.Orders;
import com.xisthebest.mapper.OrderMapper;
import com.xisthebest.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Orders> implements OrderService {
}
