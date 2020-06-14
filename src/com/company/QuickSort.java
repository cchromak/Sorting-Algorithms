package com.company;
/*
    Recursive, divide and conquer. unstable, in-place.
    chooses a pivot element and divides array into two halves.
    Partitioning step: left side is where elements are less than
    the pivot, right side is greater than pivot. Pivot ends up being
    in its correct place, however left and right array not necessarily sorted.
    O(nlogn)
 */
public class QuickSort {

    public void quickSort (int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while( i < j) {

            // empty loop body
            while(i < j && input[--j] >= pivot);
            if(i < j) {
                input[i] = input[j];
            }
            // empty loop body
            while(i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
