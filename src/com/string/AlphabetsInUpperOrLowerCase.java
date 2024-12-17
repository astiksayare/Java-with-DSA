package com.string;

public class AlphabetsInUpperOrLowerCase {

    public static void main(String[] args) {

        /*

        Note: A = 65, 65 + 32 = 97 = a
              a = 97, 97 - 32 = 65 = A

         */

        // Alphabets in upper case
        System.out.println("Capital Letters");
        for(int i = 65; i <= 90; i++){
            char ch = (char) i;
            System.out.print(ch+ " ");
        }

        // Alphabets in lower case
        System.out.println("\nSmall Letters");
        for(int i = 97; i <= 122; i++){
            char ch = (char)i;
            System.out.print(ch+" ");
        }
    }
}
