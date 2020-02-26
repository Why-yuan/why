package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.Administrator;

public interface AdministratorMapper {
    int insert(Administrator record);

    int insertSelective(Administrator record);
}