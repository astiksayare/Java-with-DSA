package com.assignment4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapArray {

    static int maxNumber(int[] arr){
        int max = arr[0];
        for(int ele: arr){
            if(max < ele){
                max = ele;
            }
        }
        return  max;
    }

    static void reverse(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(arr[i]);
        }

        System.out.println(list);
    }

    static void reverseInRange(int[] arr, int start, int end){

        while (start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

//        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = {1, 4, 10, 11, 29, 23, 8, 3, 2, 0};
        int maxVal = maxNumber(arr);
        System.out.println(maxVal);

        // Reverse
        reverse(arr);

        // Reverse the Array in the Range
        reverseInRange(arr, 2, 6);

        // Swap
        swap(arr, 5, 1);
        System.out.println(Arrays.toString(arr));
    }
}
