package com.atguigu.java;

public class TestPerson {


}


//l类： 抽象的
class Person{
    //属性
        String name;
        int age;
        boolean sex;

    // 2. 方法
    public void eat(){

        System.out.println("人吃饭");
    }

    public  void sleep(){
        System.out.println("人睡觉");
    }

    public String getName(){
        return name;
    }


    public void setName(String n){
        name = n;
    }

    public void info(){
        eat();
        sleep();
        System.out.println("name:" + name + " age: " + age +"sex" +sex);
    }

}
