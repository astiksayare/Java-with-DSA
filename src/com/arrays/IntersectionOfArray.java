package com.arrays;

import java.util.*;

public class IntersectionOfArray {

    static int[] intersectionOfArray(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        // Adding all elements of nums1 into the list collection
        for(int ele: nums1) list.add(ele);

        // Adding all elements of nums2 into the set type of collection
        for(int ele: nums2) set.add(ele);

        // This loop helps us to add only same elements from the set collection
        for(int ele: list) {
            if(set.contains(ele)) res.add(ele);
        }

        int[] arr = new int[res.size()];

        int i = 0;

        for(int ele: res) arr[i++] = ele;

        return arr;
    }


    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};

        int[] res = intersectionOfArray(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
