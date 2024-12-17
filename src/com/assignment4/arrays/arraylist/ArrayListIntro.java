package com.assignment4.arrays.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        char ch = 't'-'a';
        System.out.println(++ch);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 2);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
        System.out.println(list);
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(list.size());
//        list.set(6, 8);
//        System.out.println(list);
//        list.remove(6);
//        System.out.println(list);

//        System.out.println("Enter the number");
//        for (int i = 0; i < 5; i++) {
//            list.add(scn.nextInt());
//        }
//
//        System.out.println(list);
//        list.set(2, 8);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
    }
}
