package com.arrays;

/*

Given an integer array nums of length n,
you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

 */

import java.util.Arrays;

public class ConcatenationArray {

    static  int[] getConcatenation(int[] arr){
        int[] ans = new int[arr.length * 2];
        int start = 0;
        int end1 = arr.length  - 1;
//        int end2 = ans.length - 1;

        while(start < arr.length){

            ans[start] = arr[start];
            ans[arr.length + end1] = arr[end1];

            start++;
            end1--;
//            end2--;
        }
        return  ans;
    }

    public static void main(String[] args) {

//        int[] arr = {1, 2, 1};
//        int[] arr = {1,3,2,1};
        int[] arr = {1};

        int[] ans = getConcatenation(arr);

        System.out.println(Arrays.toString(ans));
    }

}

