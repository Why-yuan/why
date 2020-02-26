package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.OrderDetail;

public interface OrderDetailMapper {
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);
}