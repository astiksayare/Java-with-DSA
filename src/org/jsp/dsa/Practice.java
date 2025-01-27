package org.jsp.dsa;

import java.util.*;


public class Practice {

    static int maxEle(int[] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }

        return max;
    }


    static int sumOfArray(int[] arr){
        int sum = 0;

        for(int ele : arr){
            sum += ele;
        }

        return sum;
    }

    static boolean isPrime(int[] arr){
        int num = sumOfArray(arr);

        if(num <= 1) return  false;

        for(int i = 2; i < num; i++){
            if(num % i == 0) return  false;
        }

        return true;
    }

    static int[] reverseArray(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }


    static boolean isPalindromArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] != arr[end]) return false;

            start++;
            end--;
        }

        return true;
    }


    static boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }


    static void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }

    static void printPalindromNumber(int[] arr){
        for(int ele: arr){
            if(isPalindrome(ele))
            {
                System.out.print(ele+" ");
            }
        }
    }

    static boolean isPalindrome(int num){
        String str = num +"";

        int start = 0; int end = str.length() - 1;

        while( start < end ){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }


    static int[] sumOfDigitsOfArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            arr[i] = sumOfDigit(arr[i]);
        }

        return arr;
    }



    static int sumOfDigit(int num){
        int sum  = 0;

        while(num  > 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return sum;
    }

    static void occuranceOfArray(int[] arr){
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]) count++;
            }
            map.put(arr[i], count);
        }

        System.out.println(map);
    }


    public static int findUniqueNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }

    static void pairOfSum(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if( arr[i] + arr[j] == num)
                    System.out.println("["+arr[i]+", "+arr[j]+"]");
            }
        }
    }

    static int[] mergeTwoArrays(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int in = 0;

//        for(int i = 0; i < arr1.length; i++){
//            res[in++] = arr1[i];
//        }

//        for(int i = 0; i < arr2.length; i++){
//            res[in++] = arr2[i];
//        }

        // for zig-zag
        for(int i = 0; i < arr1.length || i < arr2.length; i++){

            if(i < arr1.length) {
                res[in++] = arr1[i];
            }

            if(i < arr2.length) {
                res[in++] = arr2[i];
            }
        }


        return res;
    }

    static int firstUniqueInArray(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for(int ele: arr){
            if(map.get(ele) == 1) return ele;
        }

        return -1;
    }


    public  static int maxElementIndex(int[] arr, int end){
        int max = 0;
        for(int i = 0; i <= end; i++){
            if(arr[max] < arr[i]) max = i;
        }

        return max;
    }

    public static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - 1 - i;
            int maxIndex = maxElementIndex(arr, lastIndex);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }

        return  arr;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    // For descending order
    public  static  int[] bubbleSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 1; j < arr.length - i; j++){

                if(arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }

            if(!swapped) break;

        }

        return arr;
    }

    public static void ascendingOrder(int[] arr, int start, int end){

        for(int i = start; i <= end; i++){
            boolean swapped = false;

            for(int j = 1; j <= end - i; j++){

                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }

            if(!swapped) break;
        }

    }

    public static void descendingOrder(int[] arr, int start, int end){

        for(int i = start ; i <= end; i++){
            int lastIndex = end;
            int max = maxElementIndex(arr, lastIndex);
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;

            end--;

        }
    }


    public static int[] ascendingAndDescending(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        int mid = start + ( end - start ) / 2;

        System.out.println(mid);

        ascendingOrder(arr, start, mid);

        descendingOrder(arr, mid + 1, end);

        return arr;
    }

    public static  int[] uniqueArray(int[] arr){
        Set<Integer> set = new TreeSet<>();
        for(int ele: arr){
            set.add(ele);
        }
        int[] res = new int[set.size()];
        int in = 0;
        for(int ele: set){
            res[in++] = ele;
        }

        return res;
    }

    public static int findNthLargest(int[] arr, int n) {
        // Sort the array in descending order using a basic sorting algorithm (e.g., bubble sort)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Return the nth largest number
        return arr[n - 1];
    }

    public static void main(String[] args) {

        int[] arr = {6, 33, 2, 6, 1, 9, 2, 5, 19, 10, 21, 43, 23, 5, 22, 14, 5};
        int num = 5;
        System.out.println(findNthLargest(arr, num));

//        int[] arr = {1, 2, 1, 1, 2, 3,4 , 21};

//        System.out.println(Arrays.toString(uniqueArray(arr)));
//        System.out.println(Arrays.toString(ascendingAndDescending(arr)));
//        System.out.println(Arrays.toString(selectionSort(arr)));

        // for descending order
//        System.out.println(Arrays.toString(bubbleSort(arr)));

//        System.out.println(firstUniqueInArray(arr));
//        int[] arr = {1, 2, 0, 5, 6, 4, 1};
//        int[] arr1 = {1, 3, 5, 7, 9};
//        int[] arr2 = {2, 4, 6, 8};

//        System.out.println(Arrays.toString(mergeTwoArrays(arr1, arr2)));

//        int num = 6;
//        pairOfSum(arr, num);

//        System.out.println(findUniqueNumber(arr));

//        occuranceOfArray(arr);

//        System.out.println(Arrays.toString(sumOfDigitsOfArray(arr)));
//        print(arr);
//        printPalindromNumber(arr);
//        System.out.println(Arrays.toString(reverseArray(arr)));
//        System.out.println(isPalindromArray(arr));
//        int max = maxEle(arr);
//        System.out.println(max);

//        System.out.println(isPrime(arr));
    }
}
