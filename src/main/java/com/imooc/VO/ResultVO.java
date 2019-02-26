package com.imooc.VO;

import lombok.Data;

@Data
public class ResultVO<T> {

    /***Error Code*/
    private Integer code;
    /***Error Message*/
    private String msg="";
    private T data;


}
