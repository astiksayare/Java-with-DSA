package com.string;

public class PangramString {

    static boolean isPangram(String str){
        int[] arr = new int[128];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }
        int start = 'a';
        int end = 'z';

        while (start <= end){
            if(arr[start] < 1) return false;
            start++;
        }

        return true;
    }


    public static void main(String[] args) {
        String str = "leetcode";
       boolean ans = isPangram(str);
        System.out.println(ans);

    }
}
