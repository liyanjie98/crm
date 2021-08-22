package com.sf.result;

/**
 * @description:
 * @author: ajims
 * @time: 2021/8/20 11:58
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 所有的controller统一输出
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private Integer code;
    private String message;


}
