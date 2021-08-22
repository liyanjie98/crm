package com.sf.mapper;

import com.sf.model.AccountingSummary;

public interface AccountingSummaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountingSummary record);

    int insertSelective(AccountingSummary record);

    AccountingSummary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountingSummary record);

    int updateByPrimaryKey(AccountingSummary record);
}