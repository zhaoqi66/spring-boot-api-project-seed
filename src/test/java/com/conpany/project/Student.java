package com.conpany.project;

import com.alibaba.druid.util.Utils;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/10   11:58
 **/
@Accessors(chain = true)
@Setter
@Getter
public class Student {

    private String username;
    private String pwd;

    public static void main(String[] args) {
// "code": "120030010EA", “tz”: 1462717624,
        String apikey = "c2ea13bb-e2c0-49a1-b467-fb9d95d6fc57";
        String custcode = "杭州集卡";
        String tz = "1597887923";
        String code = "120030010EA";
        String qty = "1";

        String sign = Utils.md5(apikey + custcode + tz + code + qty);
        System.out.println(sign);
    }

}
