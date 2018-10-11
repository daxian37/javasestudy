package com.atguigu.java;

/**
 * 一、面向对象思想的落地法则一：
 *     1。设计类，并设计类的成员（成员变量和成员方法）
 *     2。通过类，类创建类的对象（也称作类的实例化）
 *     3. 通过"对象.属性"或"对象.方法"来调用，完成相应的功能
 * 二、创建的多个对象，彼此各自拥有一套类的属性。当其中一个对象的属性进行修改时，不会影响的其他对象的值
 *
 * 三、 类的属性（成员变量）
 *      成员变量 vs 局部变类
 *      相同点： 1。 遵循变量声明的格式；修饰符数据类型 变量名 = 初始化值
 *              2。 都有作用域
 *      不同点： 1。声明的位置不同；
 *                  a。成员变量声明在类里，方法外
 *                  b。局部变量声明在方法内，方法的形参部分， 代码块内
 *
 *              2。成员变量的修饰付有4个： public private protected default
 *                 局部变量没有修饰符号，与所在的方法相同
 *
 *              3。初始化值： 一定会有初始化值
 *                成员变量： 如果在声明的时候不显示的赋值，那么不同的数据类型会有不同的默认初始化值。
 *                  byte short int long ===> 0
 *                  float double ===>0.0
 *                  char ===> 空格
 *                  boolean ====> false
 *                  引用类型 ===> null
 *                 局部变量：一定要显示的赋值（局部变量不会没有值）
 *
 *               4。二者在内存中存放的位置不同： 成员变量存在于对空间中；局部变量存在于栈空间中
 *
 *       总结： 关于变量的分类： 1）按照数据类型的不同：基本数据类型（8种）& 引用数据类型
 *                            2）按照声明的位置不同：成员变狼 & 局部变量
 *
 *
 *   四。 类的方法：提供某种功能的实现
 *      1）实例： public void eat(){}
 *               public String getName(){}
 *               public void setName(String n){}
 *         格式：全限修饰符号 返回值类型（void：无返回值 / 具体返回值）方法名（形参）{}
 *
 *      2)注意：
 *          关于返回值类型： void： 表明此方法不需要返回值
 *                        有返回值的方法： 在方法的最后一定有return + 返回值类型对应的变量
 *
 *              记忆： void和return不可以同时出现在一个方法内。像一对"冤家"
 *
 *      3）方法内可以调用本类的其他方法或属性，但你不能在方法内在定义方法
 *
 *
 *
 *
 *
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
        a2.name = "小花";
        System.out.println(" name: " + a1.name  +  " age: " + a1.age);
        System.out.println(" name: " + a2.name  +  " age: " + a2.age);

        //a3不意味着相较于a1重新创建的一个对象，而是a1与a3共用一个实体
        Animal a3 = a1;
        System.out.println(" name: " + a3.name  +  " age: " + a3.age);
        a3.name = "维尼熊";
        System.out.println(" name: " + a1.name  +  " age: " + a1.age);
        System.out.println(a2.desc());

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

    public  int getAge(){
        System.out.println("hello");
        return age;
        //其厚不能声明语句
    }

    //当通过对象调用此方法时，会将方法的返回值提供给方法的调用者，也就是当前的对象
    public String desc(){
       if (age>2){
           return "倩同学少年";
       }
        else {
           return "还是看动画屁啊把";
       }
    }

    public void setName(String n){//n:局部变量
        name = n;

    }

    public void addAge(){
        int i = 2;  //局部变量
        age += i;

    }

    public  void info(){
        eat();
        sleep();
    }

}