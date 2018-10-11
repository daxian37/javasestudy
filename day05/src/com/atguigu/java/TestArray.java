package com.atguigu.java;

public class TestArray {

    public static void main(String [] args){
        int[] arr = new int[]{12,4,76,0,-98,-54,-4,100};

        ArrayUtil au = new ArrayUtil();
        int max = au.getMax(arr);
        System.out.println("最大值为："+max);

        int min = au.getMin(arr);
        System.out.println("最小值为：" + min);
        System.out.print("打印该数组值为：");
        au.printArray(arr);
        System.out.println("该数组的平均值为："+au.avg(arr));
        System.out.println("该数组的总和为：" + au.getSum(arr));

        au.reverse(arr);
        System.out.print("打印该数组反转为：");au.printArray(arr);

        au.copy(arr);
        System.out.print("复制该数组后的arr1为：");au.printArray(arr);

        System.out.println("该数组执行排序后为：");
        au.sort(arr);
        au.printArray(arr);

    }

}
