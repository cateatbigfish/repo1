package com.itheima01;

/*
    小扩展：抽取方法的快捷键(ctrl+alt+M)
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] array={4,2,1,3,5};

        //调用方法，获取数组的最大值
        int max = getArrayMax(array);
        System.out.println("数组的最大值为："+max);
    }

    //获取任意int数组的最大值
    public static int getArrayMax(int[] array) {
        //1)从数组中找一个元素假设它为最大值max
        int max=array[0];
        //2)遍历数组的其他元素和max进行比较，如果比max大，就把较大的值重新赋值给max
        for(int i=1;i<array.length;i++){
            //让其他元素和max比较
            if(array[i]>max){
                max=array[i];
            }
        }
        //3)所有元素比较完毕，最终max就是最大值
        return max;
    }
}
