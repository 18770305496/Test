package com.yw.Test;

/**
 * 选择排序
 * 对于给定的一组记录，经过第一轮比较后得到最小的记录，然后将该记录与第一个记录的位置进行交换；
 * 接着对不包括第一个记录以外的其他记录进行第二轮比较，得到最小的记录并与第二个记录进行位置交换；
 * 重复该过程，直到进行比较的记录只有一个时为止。
 */
public class test2 {
    public static void main(String[] args) {
        int[] b={45, 30, 16, 79, 11, 72};
        ast(b);
        for (int i:b) {
            System.out.print(i+" ");// 11 16 30 45 72 79
        }
    }
    public static void ast(int[] a){
        for (int i=0; i<a.length; i++){
            int k=i;
            //找出最小值的下标
            for (int j = i+1; j<a.length; j++){
                if (a[j]<a[k]){
                    k=j;
                }
            }
            //将最小值放到未排序记录的第一个位置
            if (k>i){
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
    }
}
