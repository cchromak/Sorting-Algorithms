package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    BubbleSort bubble = new BubbleSort();
	    SelectionSort select = new SelectionSort();
	    InsertionSort insert = new InsertionSort();
	    ShellSort shell = new ShellSort();
	    MergeSort merge = new MergeSort();
	    QuickSort quick = new QuickSort();
	    CountingSort count = new CountingSort();
	    RadixSort radix = new RadixSort();
        int[] testArr = { 9,8,7,6,5,4,3,2,1};
        int[] selectArr = { 1000, 56, 80, 70 ,60 ,56 ,45, 23, 1, -123};
        int[] insertArr = { 4,6, 9, -1, 435, 56, 3, 1000, -567};
        int[] shellArr = { 3, 2, 1, 0, -1, -234, 4, 56, 234, -1000};
        int[] mergeArr = { 6, 2, 1, 0, -1, -234, 4, 56, 234, -1000};
        int[] quickArr = { 6, 2, 1, 0, -1, -234, 4, 56, 234, -1000};
        int[] countArr = { 1,1,1,1,2,2,5,3,3,2,7,8,9,9,6,10};
        int[] radixArr = {8765, 3456, 3221, 1234, 2190, 9999, 6512};
        select.selectionSort(selectArr);
        bubble.bubbleSort(testArr);
        insert.insertionSort(insertArr);
        shell.shellSort(shellArr);
        merge.mergeSort(mergeArr, 0, mergeArr.length);
        quick.quickSort(quickArr, 0, quickArr.length);
        count.countingSort(countArr, 1, 10);
        radix.radixSort(radixArr, 10, 4);
        System.out.println("Bubble sort test");
        System.out.println(Arrays.toString(testArr));
        System.out.println("------------------------------------------");
        System.out.println("Select sort test");
        System.out.println(Arrays.toString(selectArr));
        System.out.println("------------------------------------------");
        System.out.println("Insert sort test");
        System.out.println(Arrays.toString(insertArr));
        System.out.println("------------------------------------------");
        System.out.println("Shell sort test");
        System.out.println(Arrays.toString(shellArr));
        System.out.println("------------------------------------------");
        System.out.println("Merge sort test");
        System.out.println(Arrays.toString(mergeArr));
        System.out.println("------------------------------------------");
        System.out.println("Quick sort test");
        System.out.println(Arrays.toString(quickArr));
        System.out.println("------------------------------------------");
        System.out.println("Counting sort test");
        System.out.println(Arrays.toString(countArr));
        System.out.println("------------------------------------------");
        System.out.println("Radix sort test");
        System.out.println(Arrays.toString(radixArr));
        System.out.println("------------------------------------------");
    }
}
