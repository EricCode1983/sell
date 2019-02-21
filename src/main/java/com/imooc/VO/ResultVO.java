package com.imooc.VO;

import lombok.Data;

@Data
public class ResultVO<T> {

    /***Error Code*/
    private Integer code;
    private String msg;
    private T data;


}
