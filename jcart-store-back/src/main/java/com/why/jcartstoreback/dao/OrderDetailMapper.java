package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.OrderDetail;

public interface OrderDetailMapper {
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);
}