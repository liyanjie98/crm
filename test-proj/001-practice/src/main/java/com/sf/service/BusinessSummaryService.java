package com.sf.service;

import com.sf.model.BusinessSummary;

public interface BusinessSummaryService {
    /*
        查询所有的业务

     */
    BusinessSummary queryById(String id);

    /*
        增加数据
     */
    int addBusinessSummary();

}
