package com.company;

/*
    In place algorithm. Stable algorithm, because it doesn't sort ints of equal values.
    aka the relative positions before the sort is implemented is preserved.
 */
public class InsertionSort {

    public void insertionSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; i--) {
                if(arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

}
