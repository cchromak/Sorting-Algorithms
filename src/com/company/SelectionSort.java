package com.company;

/*
    traverses array and finds largest int playing it in the last index on right.
    goes back through entire array minus the recently placed ints to the right.
    O(n^2)
 */

public class SelectionSort {

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[0];
            int currIndex = 0;
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if(max < arr[j+1]){
                    currIndex = j + 1;
                    max = arr[j+1];
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[currIndex] = temp;

        }
    }
}
