package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {

    static long toNumber(int[] arr){
        long num = 0;
        for(int ele: arr) num = num * 10 + ele;

        return num;
    }

    static int[] toArray(int num){
        String str = num+"";
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }
        return  arr;
    }



    public static void main(String[] args) {

       int num = 123;
       int[] arr = toArray(num);
       int sum = 0;
       for(int ele: arr){
           sum += ele;
       }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}
