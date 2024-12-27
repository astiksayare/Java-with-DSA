package com.DSA;

import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] arr){

        boolean swapped;

        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1])
                {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
            }

            if(!swapped) break;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }

}
