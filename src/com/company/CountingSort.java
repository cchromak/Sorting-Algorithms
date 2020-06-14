package com.company;

/*
    not in-place algorithm. not stable UNLESS we take extra steps.
    O(n)
    makes assumptions about data. must be non negative whole number, because
    we use an array to store count of elements in original array.
    choose window 1 - 5
    original array: |5|4|4|5|5|2|1|1|3|2|
    counting array: |2|2|1|2|3|
    put back in og array: |1|1|2|2|3|4|4|5|5|5|
 */

public class CountingSort {

    public void countingSort (int[] input, int min, int max) {
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < input.length ; i++) {
            countArray[input[i] - min]++;
        }
        int j = 0;
        for (int i = min; i < max; i++) {
            while(countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }

        }

    }
}
