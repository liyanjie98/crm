package com.sf.mapper;

import com.sf.model.AccountingDetail;

public interface AccountingDetailMapper {
    int deleteByPrimaryKey(Integer seqNo);

    int insert(AccountingDetail record);

    int insertSelective(AccountingDetail record);

    AccountingDetail selectByPrimaryKey(Integer seqNo);

    int updateByPrimaryKeySelective(AccountingDetail record);

    int updateByPrimaryKey(AccountingDetail record);
}