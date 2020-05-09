package me.mole.fastjson.demo;

import com.alibaba.fastjson.JSON;
import me.mole.fastjson.bean.User;

public class FastjsonDemo {
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"guest\",\"id\":12}";
        System.out.println("deserialize...");
        User user = JSON.parseObject(jsonStr, User.class);
        System.out.println("------------------");
        System.out.println("serialize...");
        String s = JSON.toJSONString(user);
    }
}


