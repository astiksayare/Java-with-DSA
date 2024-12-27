package com.DSA.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class AllMissingNumber {

    static void sort(int[] arr){
        int i = 0;

//      int[] arr = {4, 3, 3, 2, 1, 7, 2, 8}
        while (i < arr.length){
            int indexNum = arr[i] - 1;
            if(arr[i] != arr[indexNum]) swap(arr, i, indexNum);
            else i++;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int firstNum, int secondNum){
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

    static ArrayList<Integer> allMissingNumber(int[] arr){
        sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1) list.add(i+1); // Adding into the list
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 2, 1, 7, 2, 8};
        ArrayList<Integer> ans = allMissingNumber(arr);
        System.out.println(ans);
    }
}
