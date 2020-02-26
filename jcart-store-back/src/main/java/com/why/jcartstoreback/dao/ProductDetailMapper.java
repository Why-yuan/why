package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.ProductDetail;

public interface ProductDetailMapper {
    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);
}