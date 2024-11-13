package com.assignment3.functionsormethods;

// Product of all the number entered by the user.
public class ProductOfAllNumber {

    static int multiplyAll(int ...num){

        int product = 1;
        for (int i = 0; i < num.length; i++) {
            product *= num[i];
        }
        return  product;
    }

    public static void main(String[] args) {

        int product = multiplyAll(1, 2, 3, 4);
        System.out.println("Product of all the number is: "+ product);
    }
}
