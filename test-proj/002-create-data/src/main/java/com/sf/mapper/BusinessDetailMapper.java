package com.sf.mapper;

import com.sf.model.BusinessDetail;

public interface BusinessDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessDetail record);

    int insertSelective(BusinessDetail record);

    BusinessDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDetail record);

    int updateByPrimaryKey(BusinessDetail record);
}