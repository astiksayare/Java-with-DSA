package com.assignment4.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
//        1D array
//        Scanner scn = new Scanner(System.in);
//
//        int[] arr = new int[5];
//        int[] arr1 = { 1, 2, 3, 4 };
//        System.out.println(Arrays.toString(arr1));
//        for(int ele: arr1) {
//            System.out.print(ele+" ");
//        }
//
//        System.out.print("Enter the number in the array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }

        // Printing all the array.
//        for(int num: arr)
//        {
//            System.out.print(num+ " ");
//        }

//        System.out.println(Arrays.toString(arr));

//        2D array
        int[][] arr = {
                        {1, 2, 3, 4},
                        {5, 6, 7},
                        {8, 9}
                      };
//        for (int[] ans: arr){
//            System.out.println(Arrays.toString(ans));
//        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
