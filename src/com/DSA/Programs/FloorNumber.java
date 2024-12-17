package com.DSA.Programs;

public class FloorNumber {

    /**
     * This method is used to get the lowest and closest value from the given arr.
     * @param arr
     * @param target
     * @return
     */
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return  mid;
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 12, 14, 16, 19, 20 ,22};

        int target = 11;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

}
