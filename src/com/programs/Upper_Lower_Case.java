package com.programs;

public class Upper_Lower_Case {

    public static void main(String[] args) {
        String str = "WelCOme 12@Hi bYEe 2024";

        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') temp.append((char)(ch + 32));
            else if(ch >= 'a' && ch <= 'z') temp.append((char)(ch - 32));
            else temp.append(ch);
        }

        System.out.println(temp.toString());
    }
}
