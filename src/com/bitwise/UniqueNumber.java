package com.bitwise;


public class UniqueNumber {

    static int uniqueNumber(int[] arr){
        int unique = 0;

        for(int ele : arr){
            unique ^= ele;
        }

        return  unique;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 2, 6, 4};
        int ans = uniqueNumber(arr);
        System.out.println(ans);

    }
}
