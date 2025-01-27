package org.jsp.dsa;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringPractice {


    public static String isPalindrome(String str){

//        m a d a m
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            temp.append(str.charAt(str.length() - 1 - i));
        }

        return temp.toString();
    }

    public static void calculateAllType(String str){
        int alpha = 0;
        int digit = 0;
        int sp = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') alpha++;
            else if(ch >= '0' && ch <= '9') digit++;
            else sp++;
        }

        System.out.println("Alphabetic characters are: "+alpha);
        System.out.println("Digits characters are: "+digit);
        System.out.println("Special characters are: "+sp);
    }


    public static void countOfVowelsAndConsonant(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        System.out.println(str);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
            else if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') consonants++;
        }

        System.out.println("Vowels are: "+vowels);
        System.out.println("Consonants are: "+consonants);
    }

    public static int sumOfDigits(String str){
        int num = Integer.parseInt(str);
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static int countOfWords(String str){
        int count = 0;

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = 0; i < words.length; i++){
            if(words[i] == "") continue;
            else count++;
        }

        return count;
    }


    public static String viceVersa(String str){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') res.append((char)(ch + 32));
            else if(ch >= 'a' && ch <= 'z') res.append((char)(ch - 32));
        }

        return res.toString();
    }
    public static String upperLowerCase(String str){
        String[] arr = str.split(" ");

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == "") continue;
            else {
                arr[i] = viceVersa(arr[i]);
            }
        }

        return String.join(" ", arr);
    }

    public static String capitalizeCase(String str){
        char[] ch = str.toLowerCase().toCharArray();
        for(int i = 0; i < ch.length; i++){
            if((i==0 && ch[i] != ' ') || (ch[i] != ' ' && ch[i - 1] == ' ')){
                if(ch[i] >= 'a' && ch[i] <= 'z') ch[i] = (char) (ch[i] - 32);
            }
        }

       return new String(ch);
    }

    public static String swap(String str){
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            if(i == 0) temp += last;
            else if( i == str.length() - 1) temp += first;
            else temp += str.charAt(i);
        }

        return temp;
    }

    public static String swapFirstAndLastChar(String str){
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == "") continue;

            arr[i] = swap(arr[i]);
        }

        return String.join(" ", arr);
    }

    public  static void occurrenceOfCharacters(String str){
        int[] arr = new int[128];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                System.out.println((char)(i) +" - "+ arr[i]);
            }
        }
    }

    public static void uniqueCharacters(String str){
        int[] arr = new int[128];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) System.out.print((char)(i) + " ");
        }
    }

    public static char firstUniqueCharacter(String str){
        int[] arr = new int[128];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }

        char[] ch = new char[str.length() - 1];
        int in = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) {
                ch[in++] = (char) (i);
            }
        }

        for(int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);
            for(int j = 0; j < ch.length; j++){
                if(chr == ch[j]) return chr;
            }
        }

        return ' ';
    }


    public static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()) return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public  static boolean ispalindromeString(String str){

        int start = 0;
        int end  = str.length() - 1;

        while (start < end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
    public static void subString(String str){
        int maxLen = 0;
        String res = "";
        for(int i = 0; i < str.length(); i++){

            for(int j= i+1; j < str.length(); j++){
                String sub = str.substring(i, j);
                int len = sub.length();
                if(ispalindromeString(sub)){
                    if(maxLen < len) {
                        res = sub;
                        maxLen = len;
                    }
                }
            }
        }

        System.out.println(res);
    }

    public static boolean isUnique(String str){
        int[] arr = new int[128];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > 1) return false;
        }
        return true;
    }

    public static void longestUniqueSubString(String str){
        int max = 0;
        String res = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                String sub = str.substring(i, j);
//                System.out.println(sub);
                if(isUnique(sub)){
                    if(sub.length() > max){
                        max = sub.length();
                        res = sub;
                    }
                }
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {

        String str = "abcdefbabb";
        longestUniqueSubString(str);
//        subString(str);

//        String str1 = "lamp";
//        String str2 = "plam";
//
//        System.out.println(isAnagram(str1, str2));

//        String str = "abcacdd";
//
//        System.out.println(firstUniqueCharacter(str));
//        uniqueCharacters(str);
//        occurrenceOfCharacters(str);

//        System.out.println(swapFirstAndLastChar(str));

//        System.out.println(capitalizeCase(str));

//        String str = "RaAm iS GooD";
//        System.out.println(upperLowerCase(str));

//        String str = "   Astik    is Amazing Student   ";
//        System.out.println(countOfWords(str));
//        System.out.println(sumOfDigits(str));
//        countOfVowelsAndConsonant(str);
//        calculateAllType(str);
//        String res = isPalindrome(str);
//        if(str.equalsIgnoreCase(res)) System.out.println("Palindrome");
//        else System.out.println("Not a Palindrome");
    }


}
