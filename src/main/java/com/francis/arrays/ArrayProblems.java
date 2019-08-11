package com.francis.arrays;

import java.util.Arrays;

public class ArrayProblems {
    /*How do you find the duplicate number on a given integer array? */
    private static int findDup(int[] arr) {
        return 0;
    }

    /*How do you find the missing number in a given integer array of 1 to 100?*/
    private static int findMissingNumber(int[] arr) {
        int sum = (arr.length+1)*(arr.length+2)/2;
        for(int num:arr) {
            sum-=num;
        }
        return sum;
    }

    /*How do you find the largest and smallest number in an unsorted integer array?*/
    private static void largestAndSmallestNumber(int[] arr) {

    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,4,5,6,7};
//        System.out.println(findMissingNumber(arr));
        int[] arr1 = new int[]{3,5,1,9,9393,33,93,12,0};
        int[] arr2 = new int[]{2,7,5,4,3};
        int[] arr3 = new int[]{10,1,2,3,4,5,6,7,8,9};
        ArrayUtils.doSelectionSort(arr3);
//        ArrayUtils.doBubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
