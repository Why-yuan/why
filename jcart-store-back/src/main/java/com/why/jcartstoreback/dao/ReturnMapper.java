package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Return;

public interface ReturnMapper {
    int insert(Return record);

    int insertSelective(Return record);
}