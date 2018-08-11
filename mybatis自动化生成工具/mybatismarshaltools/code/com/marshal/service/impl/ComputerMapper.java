package com.marshal.service.impl;

import com.marshal.entity.Computer;

public interface ComputerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}