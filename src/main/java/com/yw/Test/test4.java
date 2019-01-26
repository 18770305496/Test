package com.yw.Test;

/**
 * 插入排序:
 * 插入排序的思想是循环数组中每一个元素，然后将这些元素依次插入到
 * 一个有序的数列中去，实现数组的排序，也就是说循环到的当前元素索引的
 * 左侧都是已经排好序的，针对当前元素，将它依次与相邻的左侧元素比较，小于左侧
 * 就两个交换，循环比较和交换的过程，直至元素大于左侧相邻元素，或者是该元素已被交换至最左侧。
 */
public class test4 {
    public static void main(String[] args) {
        Integer[] a={1,5,3,4,9,6,12,86,49,37,0};
        ac(a);
        for (int i:a) {
            System.out.print(i+" ");// 0 1 3 4 5 6 9 12 37 49 86
        }
    }
    //方法适用于任何实现了Comparable接口的数据类型
    private static void ac(Comparable[] a){
        for (int i=1; i<a.length; i++){
            for (int j=i; j>0 && less(a[j],a[j-1]); j--){
                exch(a,j,j-1);
            }
        }
    }
    //交换数组a中第i和j两个元素
    public static void exch(Comparable[] a, int i, int j){
        Comparable c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
    //判断c1是否小于c2
    private static boolean less(Comparable c1,Comparable c2){
        return c1.compareTo(c2)<0;
    }
}
