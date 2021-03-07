package com.ligang.sort;

/**
 * @Author LiGang
 * @Date 2021/1/26 16:19
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={11,34,55,33,21,123};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                int a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
            }
        }

        for (int i = 0; i < arr.length-1-1; i++) {
            if (arr[i]>arr[i+1]){
                int a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
            }
        }

        for (int i = 0; i < arr.length-1-2; i++) {
            if (arr[i]>arr[i+1]){
                int a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
            }
        }

        for (int i = 0; i < arr.length-1-3; i++) {
            if (arr[i]>arr[i+1]){
                int a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
