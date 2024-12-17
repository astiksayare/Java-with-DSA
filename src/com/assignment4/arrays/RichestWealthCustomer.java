package com.assignment4.arrays;

public class RichestWealthCustomer {

    static int richestWealthCustomer(int[][] arr){

        int max = 0;

        for (int row = 0; row < arr.length; row++) {
            int temp = 0;

            for (int col = 0; col < arr[row].length; col++) {
                temp += arr[row][col];
            }

            if(temp > max) max = temp;
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {3,2,1},
                {1,5},{7,3},{3,5}
        };

        int result = richestWealthCustomer(arr);

        System.out.println(result);
    }
}
