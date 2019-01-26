package com.yw.Test;

/**
 * 冒泡排序
 */
public class test1 {
    public static void main(String[] args) {
        int[] arr={45, 85, 67, 26, 34, 91};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");// 26 34 45 67 85 91
        }
    }
}
