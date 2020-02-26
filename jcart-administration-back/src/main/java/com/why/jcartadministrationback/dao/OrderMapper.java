package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}