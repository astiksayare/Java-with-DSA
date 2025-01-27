package com.DSA;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while ( start <= end ){
//           int mid = (start + end)/2; // This might be throw error if int range will exceed
            int mid = start + ( end - start )/2;

            if(arr[mid] == target) return mid;

            if (isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }


    public static void main(String[] args) {
//        int[] arr = {-4, -2, 0, 4, 8, 10, 12, 13, 15, 19, 20, 22, 24, 55, 60};
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int target = 3;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
