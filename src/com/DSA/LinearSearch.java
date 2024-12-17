package com.DSA;

public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 22, 3, 5, 0, -1, 15, 12, 4, 2};
        int target = 100;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}
