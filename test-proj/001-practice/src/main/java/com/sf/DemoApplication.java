package com.sf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: ajims
 * @time: 2021/8/20 11:30
 */
@SpringBootApplication
@MapperScan("com.sf.mapper")
public class DemoApplication {
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class,args);
    }
}
