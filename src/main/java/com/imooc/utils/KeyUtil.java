package com.imooc.utils;

import java.util.Random;

public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式： 时间+随机数
     * synchronized 避免多线程并发的时候，订单号重复
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random=new Random();
        Integer number =random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
