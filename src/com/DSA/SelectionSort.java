package com.DSA;

import java.util.Arrays;

public class SelectionSort {

    static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int lastNum = arr.length - 1 - i;
            int maxNum = getMax(arr, lastNum);

            int temp = arr[maxNum];
            arr[maxNum] =  arr[lastNum];
            arr[lastNum] = temp;
        }

        return arr;
    }

    static int getMax(int[] arr, int end){

        int max = 0;
        // 4, 5, 3, 2, 1
        for(int i = 0; i <= end; i++){
            if(arr[i] > arr[max]) max = i;
        }

        return  max;
    }


    public static void main(String[] args) {
        int[] arr = {-2, -22, 2, 30, 4, 0};
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
