package com.yw.Test;

/**
 * 选择排序: 例子
 */
public class test3 {
    public static void main(String[] args) {
        int[] arr = {61, 36, 86, 34, 67, 16};
        System.out.print("排序前顺序: ");
        for (int b:arr) {
            System.out.print(b+ " ");
        }
        System.out.println();
        for (int i=0; i<arr.length; i++){
            int k=i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[k]>arr[j]){
                    k=j;
                }
            }
            if (k>i){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("排序后顺序: ");
        for (int b:arr) {
            System.out.print(b+ " ");
        }
    }
}
