package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}