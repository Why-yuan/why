package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.OrderHistory;

public interface OrderHistoryMapper {
    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);
}