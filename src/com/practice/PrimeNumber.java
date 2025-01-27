package com.practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class PrimeNumber {

    static boolean isPrime(int num){

        if(num < 2) return false;

//        for(int i = 2; i < num; i++){
//            if(num % 2 == 0) return false;
//        }
        int i = 2;
        while( i*i <= num){
            if(num % i == 0) return  false;
            i++;
        }

        return true;
    }


    public static void main(String[] args) {

        for(int i = 10; i < 40; i++){
            System.out.println(i+" is prime: "+ isPrime(i));
        }

    }
}
