package com.atguigu.java;
/*
* 1.面向对象的变成关注于类的设计
* 2.设计类实际就是设计类的成员
* 3. 基本的类的成员： 属性：（成员变量或field） 方法（Method）
*
*
* */

import java.util.Scanner;

public class TestPerson {
    public static  void main(String[] args){
        Person p1 = new Person();
        p1.info();


        p1.name = "李石磊";
        p1.age = 21;
        p1.sex = true;

        p1.info();


        p1.setName("李小磊");//p1.name="李小磊";
        p1.info();


        Person p2 = p1;
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        p2.info();


        p2 = new Person();
        System.out.println("p2: " + p2);
        p2.info();


        //实例化Scanner类的对象，通过此对象.nextXxx()调用，完成相应的功能
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i);

    }

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
//        eat();
//        sleep();
        System.out.println("name: " +  name  + "; age: "  +  age + "; sex: " + sex);
    }

}
