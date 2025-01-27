package com.programs;

import java.util.Arrays;

public class PrimeNo {

    static boolean isPrime(int num){
        if(num <= 1) return  false;

        for(int i = 2; i < num; i++){
            if(num % i == 0) return  false;
        }
        return true;
    }


    public static void main(String[] args) {

        int num = 6;
        int count = 0;
        int primeNo = 2;

        for(int i = 0; ; i++){
            if(isPrime(i)){
//                System.out.print(i+" ");
                primeNo = i;
                count++;

                if(count == num) break;
            }
        }

        System.out.println(primeNo);
    }
}
