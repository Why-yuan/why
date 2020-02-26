package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Customer;

public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);
}