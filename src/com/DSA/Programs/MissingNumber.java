package com.DSA.Programs;

public class MissingNumber {

    static void sort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int indexNum = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[indexNum]){
                swap(arr, i, indexNum);
            }else {
                i++;
            }

//           try{
//               if(arr[i] != arr[indexNum]) swap(arr, i, indexNum);
//           }catch (ArrayIndexOutOfBoundsException e){
//              i++;
//           }
        }
    }

    static void swap(int[] arr, int firstNum, int secondNum){
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

    static int missingNumber(int[] arr){
        sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(i != arr[i]) return i;
        }

        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {4, 0, 1, 2};

        int ans = missingNumber(arr);

        System.out.println(ans);
    }
}
