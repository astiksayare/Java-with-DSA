package com.DSA;

import java.util.Arrays;

public class CyclicSort {

    /**
     * It will sort the array in a cyclic order, It is a cyclic sort.
     * @param arr
     * @return
     */
    static int[] sort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int index = arr[i];
            if(arr[i] != arr[index]){
                swap(arr, i, index);
            }else {
                i++;
            }
        }

        return arr;
    }

    // This method is used to Swap the two number.
    static void swap(int[] arr, int firstNum, int secondNum){
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 1, 2};

        int[] ans = sort(arr);

        System.out.println(Arrays.toString(ans));
    }
}
