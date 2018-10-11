package com.atguigu.exer;

/**
 *
 * 要求：1）创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，
 * 输出字符串"studying"，调用showAge()方法显示age值，调用addAge()方法给对象的age属性增加2岁
 *
 * 2）创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系
 *
 *
 * */

public class TestPerson {
    public static void main(String [] args) {

        Person p1 = new Person();
        p1.study();
        p1.showAge();
        System.out.println(p1.addAge(6));
        p1.showAge();


    }
}

class Person {
    String name;
    int age;
    boolean sex;


    public void study (){
        System.out.println("Studying");
    }

    public void showAge(){
        System.out.println(age);

    }

    public int addAge(int i){

        return age += i;
    }

}
