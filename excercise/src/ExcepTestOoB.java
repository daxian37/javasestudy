import java.io.*;
public class ExcepTestOoB{

    public static void main(String args[]){
        try{
            int a[] = new int[2];

            for (int i = 0; i < a.length;i++) {
                System.out.println(a[2]);

            }
            System.out.println("Access element three :" + a[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}