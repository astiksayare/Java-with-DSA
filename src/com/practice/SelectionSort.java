package com.practice;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int lastNum = arr.length - 1 - i;
            int maxNum = max(arr, lastNum);
            int temp = arr[maxNum];
            arr[maxNum] = arr[lastNum];
            arr[lastNum] = temp;
        }
    }

    static int max(int[] arr, int end){
        int maxNo = 0;
        for(int i = 0; i <= end; i++){
            if(arr[maxNo] < arr[i]) maxNo = i;
        }

        return  maxNo;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 3, 5, 7, 6, 9, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
