package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.ProductDetail;

public interface ProductDetailMapper {
    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);
}