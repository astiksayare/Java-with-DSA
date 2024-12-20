package com.DSA.Programs;

public class PeekNumber {
    static int peekNumber(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + ( end - start ) / 2;
            if(arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }

        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int ans = peekNumber(arr);
        System.out.println(ans);
    }
}
