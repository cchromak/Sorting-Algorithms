package com.company;

/*
    Recursive
    the merge process in not in place. Divide and conquer technique.
    o(nlogn) - base 2, because we are repeatedly dividing the array in half
    during splitting phase.
    Stable algorithm
 */

public class MergeSort {



    public void mergeSort (int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public void merge(int[] input, int start, int mid, int end) {
        /* tests if last element of left array is smaller or equal to first element
        of right side array */
        if(input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArr = new int[end - start];
        while(i < mid && j < end) {
           tempArr[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
            }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArr, 0, input, start, tempIndex);

        }
    }


