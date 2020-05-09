package me.mole.fastjson.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import me.mole.fastjson.bean.User;

public class FastjsonDemo {

    public static void main(String[] args) {
        //序列化
        String jsonStr = "{\"@type\":\"me.mole.fastjson.bean.User\",\"name\":\"lala\",\"age\":11, \"flag\": true,\"sex\":\"boy\",\"address\":\"china\"}";
        System.out.println("-----------------------------------------------\n");

        //通过parse方法进行反序列化，返回的是Object
        Object obj1 = JSON.parse(jsonStr);
        System.out.println("JSON.parse(jsonStr): ");
        System.out.println("parse反序列化对象名称:" + obj1.getClass().getName());
        System.out.println("parse反序列化对象：" + obj1);
        System.out.println("-----------------------------------------------\n");

        //通过parseObject方法进行反序列化，不指定类，返回的是JSONObject
        Object obj2 = JSON.parseObject(jsonStr);
        System.out.println("JSON.parseObject(jsonStr): ");
        System.out.println("parseObject反序列化对象名称:" + obj2.getClass().getName());
        System.out.println("parseObject反序列化:" + obj2);
        System.out.println("-----------------------------------------------\n");

        //通过parseObject方法进行序列化，指定类为Object.class
        Object obj3 = JSON.parseObject(jsonStr, Object.class);
        System.out.println("JSON.parseObject(jsonStr): ");
        System.out.println("parseObject反序列化对象名称:" + obj3.getClass().getName());
        System.out.println("parseObject反序列化:" + obj3);
        System.out.println("-----------------------------------------------\n");

        //通过parseObject方法进行序列化,指定类为User.class
        Object obj4 = JSON.parseObject(jsonStr, User.class);
        System.out.println("JSON.parseObject(jsonStr): ");
        System.out.println("parseObject反序列化对象名称:" + obj4.getClass().getName());
        System.out.println("parseObject反序列化:" + obj4);
        System.out.println("-----------------------------------------------\n");

        //通过parseObject方法进行反序列化，指定类为User.class,并指定SupportNonPublicField
        // 指定SupportNonPublicField后，即使address是private，也能被成功赋值.
        Object obj5 = JSON.parseObject(jsonStr, User.class, Feature.SupportNonPublicField);
        System.out.println("JSON.parseObject(jsonStr): ");
        System.out.println("parseObject反序列化对象名称:" + obj5.getClass().getName());
        System.out.println("parseObject反序列化:" + obj5);
        System.out.println("-----------------------------------------------\n");
    }
}


