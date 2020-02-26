package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Administrator;

public interface AdministratorMapper {
    int insert(Administrator record);

    int insertSelective(Administrator record);
}