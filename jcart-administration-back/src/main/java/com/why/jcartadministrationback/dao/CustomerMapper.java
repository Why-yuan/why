package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.Customer;

public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);
}