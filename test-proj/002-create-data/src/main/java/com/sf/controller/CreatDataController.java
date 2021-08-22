package com.sf.controller;

/**
 * @description:
 * @author: ajims
 * @time: 2021/8/20 15:58
 */

import com.sf.result.DataResult;
import com.sf.service.BusinessSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生成100条数据的控制器
 */
@RestController
public class CreatDataController {

    @Autowired
    private BusinessSummaryService businessSummaryService;

    //请求示例：https://localhost:8080/getdata?page=1&size=20

    @RequestMapping("/getdata")
    public DataResult createData(@RequestParam(required = false) Integer page,
                                 @RequestParam(required = false) Integer size){
        //int result = businessSummaryService.addBusinessSummary();
        //System.out.println(result);

        return new DataResult(1000,"success",null);
    }
}
