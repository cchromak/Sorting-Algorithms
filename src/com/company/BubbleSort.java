package com.company;

/*
    traverses array bubbling up largest int to right side.
    every loop decreases the unsorted portion of the array,
    which is to the left side. right side is sorted.
    O(n^2)
 */

import java.util.Arrays;

public class BubbleSort {


    public void bubbleSort(int[] arr){
        if(arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public void swap (int[] arr, int i, int j) {

        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
