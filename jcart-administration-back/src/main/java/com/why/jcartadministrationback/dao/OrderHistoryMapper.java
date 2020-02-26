package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.OrderHistory;

public interface OrderHistoryMapper {
    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);
}