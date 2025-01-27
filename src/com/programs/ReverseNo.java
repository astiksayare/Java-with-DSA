package com.programs;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 1234;
        int temp = 0;
        int sum = 0;
        String name = "Civic";
        String str = name;
        String tempStr = "";

        char[] arr = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            tempStr += arr[(str.length() - 1) - i];
        }

        String ans = tempStr.equalsIgnoreCase(str) ? tempStr+ " Palindrome" : tempStr+" Not a Palindrom";

        System.out.println(ans);

//        while(num > 0) {
//            int rem = num % 10;
//            sum += rem;
//            temp = ( temp * 10 ) + rem;
//            num /= 10;
//        }

        System.out.println(temp);
        System.out.println(sum);
    }
}
