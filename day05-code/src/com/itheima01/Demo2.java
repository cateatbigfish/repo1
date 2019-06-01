package com.itheima01;
/*
    需求：把数组中的元素按照指定的格式输出：[1,2,3,4,5]
    思路：
        1) 先无条件输出一个"[",不换行
        2) 如果不是最后一个元素，就输出 元素+"," 不换行
           如果是最后一个元素， 就输出  元素+"]"  换行
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        printArray(array);
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
