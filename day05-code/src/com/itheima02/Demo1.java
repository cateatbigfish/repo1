package com.itheima02;

/*
* 参数是基本类型和引用类型的区别
*   1) 方法的参数是基本数据类型，形式参数的改变不影响实际参数
*   2) 方法的参数是引用数据类型，形式参数的改变直接影响实际参数
*          因为实际参数传递是地址值
*
* */
public class Demo1 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] y=array;
	y[1]=59;
        method2(array);
        System.out.println(array[1]);
    }

    public static void method2(int[] x){//int[ ]x=array
        x[0]=250;
    }

    public static void method1(int a){
        a++;
        System.out.println(a); //11
    }
}
