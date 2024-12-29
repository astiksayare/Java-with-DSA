package com.patterns;

public class Patterns {


    // Pattern 1
    static void pattern1(int n){

        /*
                 * * * * *
                 * * * * *
                 * * * * *
                 * * * * *
                 * * * * *
         */
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    static void pattern2(int num){

        /*
                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
         */
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int num){
        /*
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
         */
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <=num-row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    static void pattern4(int num){

        /*
                    1 2 3 4 5
                    1 2 3 4
                    1 2 3
                    1 2
                    1
         */
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <=num-row + 1; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    static void pattern5(int num){

        /*

                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *

         */
        for(int row = 1; row <= num * 2; row++){
            int totalCol = row <= num ? row : num*2 - row;
            for(int col = 1; col <= totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 6
    static void pattern6(int num){
        /*
                         *
                        * *
                       * * *
                      * * * *
                     * * * * *
                      * * * *
                       * * *
                        * *
                         *

         */

        for(int row = 1; row <= num * 2; row++){
            // Spaces
            int totalSpace = row <= num ? num - row : row - num;
            for(int space = 1; space <= totalSpace; space++){
                System.out.print(" ");
            }

            // Pattern
            int totalCol = row <= num ? row : num*2 - row;
            for(int col = 1; col <= totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 7
    static void pattern7(int num){
        /*
                         *
                        **
                       ***
                      ****
                     *****
         */

        for(int row = 1; row <= num; row++){

            // for the spaces
            for(int space = 1; space <= num - row; space++){
                System.out.print(" ");
            }

            // loop for the patter
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Pattern 8
    static void pattern8(int num){
        /*
                 *****
                  ****
                   ***
                    **
                     *
         */

        for(int row = 1; row <= num; row++){

            // for the spaces
            for(int space = 1; space <= row; space++){
                System.out.print(" ");
            }

            // loop for the patter
            for(int col = 1; col <= num - row+1; col++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // Pattern 9
    static void pattern9(int num){
        /*
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
         */

        for(int row = 1; row <= num; row++){

            // for the spaces
            for(int space = 1; space <= num - row; space++){
                System.out.print(" ");
            }

            // loop for the pattern
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    // Pattern 10
    static void pattern10(int num){
        /*
                         *
                        ***
                       *****
                      *******
                     *********
         */

        for(int row = 1; row <= num; row++){

            // for the spaces
            for(int space = 1; space <= num - row; space++){
                System.out.print(" ");
            }

            // loop for the first pattern
            for(int col1 = 1; col1 <= row; col1++){
                System.out.print("*");
            }

            // loop for the second pattern
            for(int col2 = 1; col2 <= row - 1; col2++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // Pattern 11
    static void pattern11(int num){
        /*
                 *********
                  *******
                   *****
                    ***
                     *
         */

        for(int row = 1; row <= num; row++){

            // for the spaces
            for(int space = 1; space <= row - 1; space++){
                System.out.print(" ");
            }

            // loop for the first pattern
            for(int col1 = 1; col1 <= num - row; col1++){
                System.out.print("*");
            }

            // loop for the second pattern
            for(int col2 = 1; col2 <= num - row + 1; col2++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // Pattern 12
    static void pattern12(int num){
        /*
                     * * * * *
                      * * * *
                       * * *
                        * *
                         *
         */

        for(int row = 0; row < num; row++){

            // for the spaces
            for(int space = 1; space <= row; space++){
                System.out.print(" ");
            }

            // loop for the pattern
            for(int col = 1; col <= num - row; col++){
                System.out.print("* ");
            }


            System.out.println();
        }

    }

    // Pattern 13
    static void pattern13(int num){
        /*
                     * * * * *
                      * * * *
                       * * *
                        * *
                         *
                         *
                        * *
                       * * *
                      * * * *
                     * * * * *
         */

        // Loop for the above pattern
        for(int row = 0; row < num; row++){

            // for the spaces
            for(int space = 1; space <= row; space++){
                System.out.print(" ");
            }

            // loop for the pattern
            for(int col = 1; col <= num - row; col++){
                System.out.print("* ");
            }


            System.out.println();
        }

        // Loop for the below pattern
        for(int row = 0; row < num; row++){

            // loop for the spaces
            for(int space = 1; space < num - row; space++){
                System.out.print(" ");
            }

            // loop for the pattern
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    // Pattern 14
    static void pattern14(int n){
        /*
                     *
                    * *
                   *   *
                  *     *
                 *********
         */

        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == n || col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }


    }

    // Pattern 15
    static void pattern15(int num){
        /*
                 *********
                  *     *
                   *   *
                    * *
                     *
         */

        for (int row = 0; row < num; row++) {

            // loop for the spaces
            for(int space = 0; space < row; space++){
                System.out.print(" ");
            }

            // print starts and space
            for(int col = 1; col < (num * 2) - (row * 2); col++){
                if(row == 0 || col == 1 || col == ((num * 2) - (row * 2)) - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            // For next Line
            System.out.println();
        }


    }

    // Pattern 16
    static void pattern16(int num){
        /*
                         *
                        * *
                       *   *
                      *     *
                     *       *
                      *     *
                       *   *
                        * *
                         *
         */

        // For Up-side pattern
        for (int row = 1; row < num; row++) {
            // Print spaces
            for (int space = 1; space <= num - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int col = 1; col <= 2 * row - 1; col++) {
                if ( col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }


        // For down-side pattern
        for (int row = 0; row < num; row++) {

            // loop for the spaces
            for(int space = 0; space < row; space++){
                System.out.print(" ");
            }

            // print starts and space
            for(int col = 1; col < (num * 2) - (row * 2); col++){
                if( col == 1 || col == ((num * 2) - (row * 2)) - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            // For next Line
            System.out.println();
        }


    }


    public static void main(String[] args) {
        pattern16(5);
    }

}
