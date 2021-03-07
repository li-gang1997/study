package com.ligang.sort;

/**
 * @Author LiGang
 * @Date 2021/1/26 16:19
 * @Version 1.0
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int [] arr={1,5,2,6,4,98,22,44,0,-1};

        for (int a = 0; a < arr.length-1; a++) {
            for (int i = 0; i < arr.length-1-a; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
