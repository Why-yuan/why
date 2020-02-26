package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.ReturnHistory;

public interface ReturnHistoryMapper {
    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);
}