package com.itheima02;

public class Demo2 {
    public static void main(String[] args) {
        int[] arrayA={1,2,3,4};
        int[] arrayB={5,6,7,8};

        int[] newArray = groupArray(arrayA, arrayB);
        System.out.println(newArray);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+",");
        }
    }

    //把两个数组组合成一个数组
    public static int[] groupArray(int[] array1,int[] array2){
        //创建一个新的数组，长度arrayA和arrayB长度值和
        int[] newArray=new int[array1.length+array2.length];

        //先把array1中的元素赋值给newArray
        for (int i = 0; i < array1.length; i++) {
            newArray[i]=arrayA[i];
        }
        //再把array2中的元素赋值给newArray
        for (int i = 0; i < arrayB.length; i++) {
            //由于newArray中前面几个元素都是arrayA赋值过来来的
            //arrayB中的元素往newArray中赋值，索引相差arrayA.length个索引单位
            newArray[i+arrayA.length]=arrayB[i];
        }

        System.out.println(newArray); //地址值

        return newArray;
    }
}
