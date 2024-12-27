package com.DSA.Programs;

public class DuplicateNumber {

    static int sort(int[] arr){
        int i = 0;

//      {0, 1, 2, 3, 4, 2}
        while(i < arr.length){

            if(arr[i] != i){
                int index = arr[i];
                if(arr[i] != arr[index]) swap(arr, i, index);
                else return  arr[i];
            }else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int firstNum, int secondNum){
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

//    static int findDuplicate(int[] arr){
//        sort(arr);
//
//        for(int i = 0; i < arr.length; i++){
//           for(int j = i+1; j < arr.length; j++){
//               if(arr[i] == arr[j]) return arr[i];
//           }
//        }
//
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 0, 2};

        int ans = sort(arr);

        System.out.println(ans);
    }
}
