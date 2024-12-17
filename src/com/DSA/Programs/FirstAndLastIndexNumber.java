package com.DSA.Programs;

import java.util.Arrays;

public class FirstAndLastIndexNumber {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static  int search(int[] arr, int target, boolean firstIndex){
        int start = 0; int end = arr.length - 1;
        int ans = -1;

        while ( start <= end ){
            int mid = start + ( end - start ) / 2;

            if( target < arr[mid]) end = mid - 1;
            else if( target > arr[mid]) start = mid + 1;
            else {
                ans = mid;
                if(firstIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 7, 8, 8, 8, 8, 9};
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
