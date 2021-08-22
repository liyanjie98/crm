package com.sf.controller;

import com.sf.model.BusinessSummary;
import com.sf.service.BusinessSummaryService;
import com.sf.util.HttpClientsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.www.http.HttpClient;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: ajims
 * @time: 2021/8/20 11:07
 */
@Controller
public class MyController {
    @Autowired
    private BusinessSummaryService businessSummaryService;

    /**
     *
     * @param model
     * @param page 需要第几页的
     * @param size 多少条数据
     * @return
     */
    @RequestMapping("/get")
    public String getModel(Model model,Integer page,Integer size){

        String uri = "https://localhost:8080/getdata";
        //请求示例：https://localhost:8080/getdata?page=1&size=200
        Map map = new HashMap();
        map.put("page",page);
        map.put("size",size);
        try {
            String result = HttpClientsUtil.doPost(uri, map);

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "index";
    }

    @RequestMapping("api")
    public @ResponseBody  Map<String,Object> testApi(){
        Map<String ,Object> map = new HashMap<>();
        map.put("姓名","lisi");
        map.put("年龄",20);
        Map<String , Object> map2 = new HashMap<>();
        map2.put("城市","杭州");
        map2.put("区","上城区");
        map.put("地址",map2);
        return map;
    }

}
