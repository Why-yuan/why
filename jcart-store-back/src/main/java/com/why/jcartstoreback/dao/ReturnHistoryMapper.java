package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.ReturnHistory;

public interface ReturnHistoryMapper {
    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);
}