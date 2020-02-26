package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}