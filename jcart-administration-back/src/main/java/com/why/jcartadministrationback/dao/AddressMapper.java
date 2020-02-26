package com.why.jcartadministrationback.dao;

import com.why.jcartadministrationback.po.Address;

public interface AddressMapper {
    int insert(Address record);

    int insertSelective(Address record);
}