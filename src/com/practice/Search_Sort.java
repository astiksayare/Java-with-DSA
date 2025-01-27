package com.practice;

public class Search_Sort {

    static int binarySearch(int[] arr, int target){
        sort(arr);
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + ( end - start )/2;
            if(target == arr[mid]) return mid;
            if(isAsc){
                if(target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }else {
                if(target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }

        }

        return -1;
    }

    static void sort(int[] arr){

        int i = 0;

        while(i < arr.length){
            int indexVal = arr[i];

            if(arr[i] != arr[indexVal]){
                swap(arr, i, indexVal);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int firstNum, int secondNum){
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int target = 5;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
