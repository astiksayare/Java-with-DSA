package com.DSA.Programs;

public class FindNumber {

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length)
        {
            int indexNo = arr[i];

            if(indexNo < arr.length && arr[i] != arr[indexNo]){
                swap(arr, i, indexNo);
            }else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int firstNo, int secondNo){
        int temp = arr[firstNo];
        arr[firstNo] = arr[secondNo];
        arr[secondNo] = temp;
    }


    public static int missingNumber(int[] nums) {
        sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i]) return i;
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2, 3, 5};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
