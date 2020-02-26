package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Address;

public interface AddressMapper {
    int insert(Address record);

    int insertSelective(Address record);
}