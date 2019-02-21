package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;


}
