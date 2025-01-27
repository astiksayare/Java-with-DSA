package com.programs;

public class FiboNo{

    public static void main(String[] args) {
        int num = 5;
        int i = 0, j = 1;
        int sum = 0;
        int fiboNo = 0;
        while(num > 0){
//            System.out.print(i+ " ");
            fiboNo = i;
            sum = i + j;
            i = j; j = sum;
            num--;
        }

        System.out.println(fiboNo);
    }
}
