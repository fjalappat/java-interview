package com.francis.arrays;

import java.util.Arrays;

class ArrayUtils {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void doSelectionSort(int[] arr) {
        System.out.println("Selection sort starts now ...");
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]) {
                    ArrayUtils.swap(arr, i, j);
                }
                System.out.println("i="+i+", j="+j+" : "+Arrays.toString(arr));
                count++;
            }
        }
        System.out.printf("Selection sort is completed in %d steps ...",count);
    }

    static void doBubbleSort(int[] arr) {
        System.out.println("Bubble sort starts now ...");
        int count =0;
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]) {
                    ArrayUtils.swap(arr, j, j+1);
                    swapped = true;
                }
                System.out.println("i="+i+", j="+j+" : "+Arrays.toString(arr));
                count++;
            }
//            if (!swapped)
//                break;
        }
        System.out.printf("Bubble sort is completed in %d steps ...",count);
    }


}
