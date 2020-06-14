package com.company;

/*
    NOT stable. in place algorithm.
    Knuth sequence can be used for the gap number: (3^k - 1)2
    the ending gap number must be less but as close to the length of the array.
    ex: array.length = 20, then gap of 13.
    our example we do half of the array.length and divide by two.
    in some cases it leads to final gap of 1, but in some it doesn't, so
    you must manually add an insertion sort to cover your butt.
 */

public class ShellSort {

    public void shellSort (int[] arr) {
        int gap = arr.length / 2;
        for (; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                if (arr[i] < arr[i - gap]) {
                    int temp = arr[i - gap];
                    arr[i - gap] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        InsertionSort insert = new InsertionSort();
        insert.insertionSort(arr);
        }
    }


