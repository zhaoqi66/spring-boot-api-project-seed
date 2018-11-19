package com.company.project.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Slf4j
public class TimeUtil {

    /**
     * 获取当前时间戳
     */
    public static String getTimeString() {
        //格式化当前时间
        SimpleDateFormat sfDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String strDate = sfDate.format(new Date());
        //得到17位时间如：20170411094039080
//        log.info("时间17位：strDate={}", strDate);
        //为了防止高并发重复,再获取3个随机数
//        String random = getRandom620(3);
        //最后得到20位订单编号。
//        log.info("订单号20位：orderId={}" , strDate + random);
        return strDate;
    }

    /**
     * 获取6-10 的随机位数数字
     */
    public static String getRandom(Integer length) {
        String result = "";
        Random rand = new Random();
        int n = 20;
        if (null != length && length > 0) {
            n = length;
        }
        int randInt = 0;
        for (int i = 0; i < n; i++) {
            randInt = rand.nextInt(10);
            result += randInt;
        }
        return result;
    }
}
