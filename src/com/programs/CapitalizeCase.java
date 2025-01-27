package com.programs;

import java.util.Arrays;

public class CapitalizeCase {
    static String toCapitalize(String str){
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == "") continue;
            String temp = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            arr[i] = temp;
        }

        return String.join(" ", arr).trim();
    }


    public static void main(String[] args) {
        String str = "Astik is a very good bOyyY";
        String res = toCapitalize(str);
        System.out.println(res);
        String[] arr = res.split(" ");
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if((i == 0 && arr[i] != "") || arr[i-1] != "") count++;

        }
        System.out.println(count);
    }
}
