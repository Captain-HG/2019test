package com.lzc.vuetest.vo;

import lombok.Data;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/17
 * @Description
 */
@Data
public class ResultVO<T> {
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 返回状态码
     */
    private Integer code;
}
