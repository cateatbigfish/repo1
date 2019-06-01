package com.itheima01;
/*
    思路：
        1)定义两个索引start和end，分别表示开始索引和结束索引
            int start=0,end=array.length-1;

        2)使用for循环从数组两头往中间循环遍历数组
            每次循环之后让start++,end--
            当start>=end的时候结束循环(也就是start<end才进入循环)

        3)每次循环让array[start]和array[end]元素交换位置
 */
public class Demo4 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        //打印数组
        printArray(array);
        //反转数组
        reverse(array); //ctrl+点击
        //打印数组
        printArray(array);
    }

    //把指定的数组反转
    public static void reverse(int[] array) {
        //使用for循环从数组两头往中间循环遍历数组
        for(int start=0,end=array.length-1;start<end;start++,end--){
            //每次循环让array[start]和array[end]元素交换位置
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
    }

    //按照指定格式输出数组中的元素
    public static void printArray(int[] array){
        //1) 先无条件输出一个"[",不换行
        System.out.print("[");
        //2) 遍历数组中的每一个元素
        for (int i = 0; i < array.length; i++) {
            if(i!=array.length-1){
                System.out.print(array[i]+",");
            }else{
                System.out.println(array[i]+"]");
            }
        }
    }
}
