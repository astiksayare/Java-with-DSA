package com.programs;

import java.util.Scanner;

public class VowelsInString {
    static int countOfString(String str){
        int count = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        String[] arr = str.split(" ");

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == "" ) continue;

            System.out.println(arr[i] +"-" + countOfString(arr[i]));
        }
    }

}
