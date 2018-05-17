package com.atguigu.java;

/**
 * 面向对象思想的落地法则一：
 * 1。设计类，并设计类的成员（成员变量和成员方法）
 * 2。通过类，类创建类的对象（也称作类的实例化）
 *3. 通过"对象.属性"或"对象.方法"来调用，完成相应的功能
 * */
public class Zoo {
    public static void main(String [] args){
        //基本数据类型的声明： 数据类型 变量名 = 初始化值
        int i = 10;
        //类的实例化： 如下的a1就是一个实施在在的存在的对象
        Animal a1 = new Animal();
        //通过对象调用属性
        a1.name = " 花花";
        a1.age = 3;
        System.out.println(" name: " + a1.name  +  " age: " + a1.age);

        //通过对象调用方法
        a1.eat();
        a1.sleep();
        System.out.println(a1.getName());
        a1.setName("大黑");
        System.out.println(a1.name);




        //在创建一个类的对象
        Animal a2 = new Animal();
        System.out.println(" name: " + a2.name  +  " age: " + a2.age);

    }
}


class Animal{
    //1.属性
    String name;
    int age;


    //2f方法；

    public void  eat(){
        System.out.println("动物进食");

    }

    public void sleep(){
        System.out.println("动物睡觉");
    }
    public  String getName(){
        return name;
    }
    public void setName(String n){
        name = n;

    }


}