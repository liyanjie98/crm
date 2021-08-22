package com.sf.mapper;

import com.sf.model.BusinessSummary;

public interface BusinessSummaryMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusinessSummary record);

    int insertSelective(BusinessSummary record);

    BusinessSummary selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusinessSummary record);

    int updateByPrimaryKey(BusinessSummary record);
}