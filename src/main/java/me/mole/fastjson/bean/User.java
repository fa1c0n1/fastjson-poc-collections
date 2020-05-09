package me.mole.fastjson.bean;

import java.util.Properties;

public class User {
    private Long   id;
    private String name;

    public User() {
        System.out.println("User constructor method called.");
    }

    public Long getId() {
        System.out.println("getId() called");
        return id;
    }
    public void setId(Long id) {
        System.out.println("setId() called");
        this.id = id;
    }
    public String getName() {
        System.out.println("getName() called");
        return name;
    }
    public void setName(String name) {
        System.out.println("setName() called");
        this.name = name;
    }
}
