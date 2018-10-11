package com.atguigu.exer;


/*
*
* 利用面向对象的编程方法，设计类Circle计算元的面积
* */
public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.redius = 2.3;
        c1.findArea();
        c1.setRedius(10);
        c1.findArea();

    }

}


class Circle{
    double redius;

    public double getRedius() {
        return redius;
    }

    public void setRedius(double r) {
        redius = r;
    }

    public void findArea(){

        System.out.println(3.14*redius*redius);
    }
 }
