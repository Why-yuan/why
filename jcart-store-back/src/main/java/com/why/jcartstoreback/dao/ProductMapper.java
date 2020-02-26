package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}