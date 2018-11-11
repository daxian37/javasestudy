import java.util.Scanner;

/**
 * 1. 面向对象的编程关注于类的设计
 * 2. 射击类就是设计类的成员
 * 3. 基本的类包括类的成员； 属性（成员变量或field） & 方法（method）
 */

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();

        //通过属性的方式来设置修改
        p1.info();
        p1.age = 21;
        p1.name = "钟超";
        p1.sex = true;
        p1.info();

        //通过方法的方式来设置修改
        p1.setName("付浩"); //p1.name = "付浩"
        p1.info();

        Person p2 = p1;
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        p2.info();

        p2 = new Person();
        System.out.println("p2:" + p2);
        p2.info();

        //实例化Scanner类的对象， 通过此对象.nextXxx()调用，完成相应的功能。
        Scanner s = new Scanner(System.in);
        if (!(s.nextInt() == 0)){
            return;
        }


        //自学的联系
        p1.setAge(13);
        p1.setName("Lishilei");
        p1.sex = true;
        p1.info();
        p1.getAge();
        p1.getName();
        System.out.println("p1的名字：" + p1.getName() + "  " + "p1的年龄：" +  p1.getAge() + " " + "p1的性别：" + (p1.sex = false));

    }

}

class Person {
    //1.属性
    String name;
    int age;
    boolean sex;


    //方法

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex(){
        return sex;
    }

    public void setSex (boolean sex){
         this.sex = sex;

    }

    public void info() {
//        eat();
//        sleep();
        System.out.println("name:" + name + "    age:" + age + "   sex:" + sex);
    }
}
