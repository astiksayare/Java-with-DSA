package com.programs;

public class ArmstrongNo {
    static int countOf(int num){
        int count = 0;

        while(num > 0){
            count++;
            num /= 10;
        }

        return count;
    }

    static boolean isArmstrong(int num){

        int count = countOf(num);
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        return sum == num;
    }


    public static void main(String[] args) {
        int num = 1634;

        String ans = isArmstrong(num) ? "Yes" : "No";

        System.out.println(ans);
    }

}
