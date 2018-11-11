/**
 * 1. 面向对象的编程关注于类的设计
 * 2. 射击类就是设计类的成员
 * 3. 基本的类包括类的成员； 属性（成员变量或field） & 方法（method）
 */

public class TestPerson {


}

class Person{
   //1.属性
   String name;
   int age;
   boolean sex;


   //方法

   public void eat(){
      System.out.println("人吃饭");
   }
   public void sleep(){
      System.out.println("人睡觉");
   }

   public String getName(){
      return name;
   }
   public void setName(String n){
      name = n;
   }
   public int getAge(){
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
   public void info(){
      eat();
      sleep();
      System.out.println( "name:" + name + "age:" + age + "sex" + sex);
   }
}
