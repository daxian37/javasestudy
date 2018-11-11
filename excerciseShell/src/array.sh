#!/bin/bash
# author:菜鸟教程
# url:www.runoob.com

my_array=(A B "C" D)

echo "第一个元素为: ${my_array[0]}"
echo "第二个元素为: ${my_array[1]}"
echo "第三个元素为: ${my_array[2]}"
echo "第四个元素为: ${my_array[3]}"

# * 和 #可以获取所有的数组
echo "数组的元素为: ${my_array[*]}"
echo "数组的元素为: ${my_array[@]}"

# 获取数组的长度
echo "数组元素个数为: ${#my_array[*]}"
echo "数组元素个数为: ${#my_array[@]}"