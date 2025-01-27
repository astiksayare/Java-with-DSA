package org.jsp.dsa;

import java.util.Arrays;

public class Array2DPractice {

    public static int[] sumOfDiagonals(int[][] arr){
        int psum = 0;
        int ssum = 0;

        int len = arr.length;

        for(int i= 0; i < len; i++){
            psum += arr[i][i];
            ssum += arr[i][len - 1 - i];
        }
        return new int[]{psum, ssum};
    }


    public static int[][] transposeMatrix(int[][] arr){

        int[][] transpose = new int[arr.length][arr[0].length];
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                transpose[col][row] = arr[row][col];
            }
        }

        return transpose;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Create a new matrix to store the rotated matrix
        int[][] rotated = new int[n][n];

        // Perform the rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 0},
                {4, 1, 6},
                {7, 8, 5}
              };

        for(int[] ele: rotateMatrix(arr)){
            System.out.println(Arrays.toString(ele));
        }

//        for(int[] ele: transposeMatrix(arr)){
//            System.out.println(Arrays.toString(ele));
//        }

//        int[]res = sumOfDiagonals(arr);
//        System.out.println(res[0]);
//        System.out.println(res[1]);
    }
}
