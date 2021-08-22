package com.sf.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: ajims
 * @time: 2021/8/20 17:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResult {

    private Integer code ;
    private String message;
    private List list;
}
