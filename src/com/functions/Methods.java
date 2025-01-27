package com.functions;

public class Methods {
    /**
     * This method is used to return the boolean value
     * if the number is even it will return the true
     * else it will return the false
     * @param num
     * @return
     */
    public  static boolean evenOdd(int num){
//        return (num % 2) == 0;
        return (num & 1) == 0;
    }

    /**
     * Factor method is used to return the series of the number
     * who is divisible by the given number.
     * @param num
     */
    public static void factor(int num){
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0) System.out.print(i+" ");
        }
        System.out.println(num);
    }

    /**
     * This method is used to return the factorial of a given number.
     * @param num
     * @return
     */
    public static int factorial(int num){
        if(num == 0 || num == 1) return 1;
        int prod = 1;
        for(int i = 1; i <= num; i++) prod*= i;

        return prod;
    }

    /**
     * This is method is used to check the given number is prime number or not.
     * @param num
     * @return
     */
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        if(num==2) return true;

        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

}
