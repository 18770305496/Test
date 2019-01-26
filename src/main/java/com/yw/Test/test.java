package com.yw.Test;

/**
 * 冒泡排序
 */
public class test {
    public static void main(String[] args) {
        int arr[] = {2, 45, 68, 95, 32, 76};
        System.out.print("排序前的顺序是: ");
        for (int test: arr) {
            System.out.print(test+" ");//排序前的顺序是: 2 45 68 95 32 76
        }
        System.out.println();
        for (int i=0; i<arr.length-1;i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("排序前的顺序是: ");
        for (int test:arr) {
            System.out.print(test+" ");//排序前的顺序是: 2 32 45 68 76 95
        }
    }
}
