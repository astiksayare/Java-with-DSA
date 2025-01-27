package com.arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static  void flipAndInvertImage(int[][] arr) {
        int[][] ans = new int[arr.length][arr[0].length];
        // reverse the array
        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            for(int j = arr.length - 1; j >= 0; j--){
                ans[i][temp] = arr[i][j];
                temp++;
            }
        }

        for(int i = 0; i < ans.length; i++){
            for (int j = 0; j < ans[i].length; j++) {
                if(ans[i][j] == 0) ans[i][j] = 1;
                else ans[i][j] = 0;
            }
        }

        for(int[] ele: ans) System.out.println(Arrays.toString(ele));
    }

    public static void main(String[] args) {
        int[][] arr = {
                        {1,1,0},
                        {1,0,1},
                        {0,0,0}
        };
        flipAndInvertImage(arr);

    }
}
