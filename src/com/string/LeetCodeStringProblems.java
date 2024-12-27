package com.string;

import java.util.Arrays;

public class LeetCodeStringProblems {
    public static void main(String[] args) {
//        String address = "1.1.1.1";
//        String newStr = address.replace(".", "[.]");
//        System.out.println(newStr);

//        String command = "G()(al)";
//        System.out.println(command);
//        StringBuilder str = new StringBuilder(command.length());
//        for (int i = 0; i < command.length(); i++) {
//
//            if('G' == command.charAt(i)){
//                str.append("G");
//            }else if('(' == command.charAt(i) && ')' == command.charAt(i+1)){
//                str.append("o");
//                i++;
//            }else {
//                str.append("al");
//                i+=3;
//            }
//
//        }
//


//        3] https://leetcode.com/problems/sorting-the-sentence/description/

        /*
        String str = "is2 sentence4 This1 a3";
        String[] words = str.split(" ");
        String[] arr = new String[words.length];
        for(String ele: words){
            int i = ele.charAt(ele.length() - 1) - '0';
            arr[i-1] = ele.substring(0, ele.length() - 1);
        }

        String result = String.join(" ", arr);
        System.out.println(result);


         */

//        4] https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        String res1 = String.join("", word1);
        String res2 = String.join("", word2);

        System.out.println(res1.equals(res2));

    }
}
