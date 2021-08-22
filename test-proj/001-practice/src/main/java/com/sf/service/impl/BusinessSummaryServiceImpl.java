package com.sf.service.impl;

import com.sf.mapper.BusinessSummaryMapper;
import com.sf.model.BusinessSummary;
import com.sf.service.BusinessSummaryService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.PropertyAccessorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @description:
 * @author: ajims
 * @time: 2021/8/20 11:19
 */
@Service
public class BusinessSummaryServiceImpl implements BusinessSummaryService {

    @Autowired
    private BusinessSummaryMapper businessSummaryMapper;
    /**
     *查询业务汇总
     * @return
     */
    @Override
    public BusinessSummary queryById(String id) {
        return businessSummaryMapper.selectByPrimaryKey(id);
    }

    /*
    模拟生成100条数据
     */
    @Override
    public int addBusinessSummary() {
        int insert=0;
        for (int i=0;i<100;i++){
            BusinessSummary businessSummary =new BusinessSummary();
            String id = RandomStringUtils.randomNumeric(20);//随机生成20 为的数字作为id
            businessSummary.setId(id);
            businessSummary.setProcDate(new Date());
            businessSummary.setTotalCount(i++);
            businessSummary.setTotalAmt(10000);
            businessSummary.setSuccCount(i++);
            businessSummary.setSuccAmt(10000);
            businessSummary.setFailCount(0);
            businessSummary.setFailAmt(0);
            businessSummary.setPackNo(5);
            businessSummary.setCurPackNo(5);
            businessSummary.setStatus(3);//状态  -2-接收中 -1-未处理  2-处理中 3-全部成功 4-全部失败 5-部分成功
            businessSummary.setPayeeActNo(RandomStringUtils.randomNumeric(35));// 收款账号
            businessSummary.setRecvDate(new Date());
            businessSummary.setRecvTime(new Date());
            if (businessSummary.getRelMainId()==null){
                String relId = RandomStringUtils.randomNumeric(20);
                businessSummary.setRelMainKhId(relId);
                businessSummary.setRelMainId(null);
            }
             insert= businessSummaryMapper.insert(businessSummary);
        }
        return insert;
    }

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomNumeric(20));
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(fmt.format(new Date()));

    }
}
