package com.DSA.Programs;

public class CellingNumber {

    /**
     * This method is used to give the highest value near the target element.
     * @param arr
     * @param target
     * @return
     */
    static  int celling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while ( start <= end ){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end  = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }

        return  start;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 10, 14};
        int target = 9;

        int ans = celling(arr, target);
        System.out.println(ans);
    }
}
