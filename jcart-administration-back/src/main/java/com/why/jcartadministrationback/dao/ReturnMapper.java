package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.Return;

public interface ReturnMapper {
    int insert(Return record);

    int insertSelective(Return record);
}