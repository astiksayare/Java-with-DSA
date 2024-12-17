package com.assignment4.arrays;

import java.util.Arrays;

public class ArrayPermutation {
    static int[] arrayPermutation(int[] arr){

        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[arr[i]];
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
//        int[] arr = {0,2,1,5,3,4};

        int[] ans = arrayPermutation(arr);

        System.out.println(Arrays.toString(ans));
    }
}
