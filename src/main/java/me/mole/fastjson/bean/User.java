package me.mole.fastjson.bean;

public class User {
    private String name; //私有属性, 有getter、setter方法
    private int   age; //私有属性，有getter、setter方法
    private boolean flag; //私有属性，有is、setter方法
    public String sex; //公有属性，无getter、setter方法
    private String address; //私有属性, 无getter、setter方法

    public User() {
        System.out.println("call User default constructor method.");
    }

    public int getAge() {
        System.out.println("call User getAge()");
        return this.age;
    }
    public void setAge(int age) {
        System.out.println("call User setAge()");
        this.age = age;
    }
    public String getName() {
        System.out.println("call User getName()");
        return this.name;
    }
    public void setName(String name) {
        System.out.println("call User setName()");
        this.name = name;
    }

    public boolean isFlag() {
        System.out.println("call User isFlag()");
        return this.flag;
    }

    public void setFlag(boolean flag) {
        System.out.println("call User setFlag()");
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flag=" + flag +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
