package com.arrays;

public class SumOfCombination {

    static void binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            if(arr[start] + arr[end] == target){
                System.out.println(arr[start]+", " + arr[end]);
                start++;
                end--;
            }else if(arr[start] + arr[end] > target){
                end--;
            }else {
                start++;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {};
        int target = 10;
        binarySearch(arr, target);
    }
}
