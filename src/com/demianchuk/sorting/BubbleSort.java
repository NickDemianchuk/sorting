package com.demianchuk.sorting;

public class BubbleSort implements Sortable {
    @Override
    public int[] sort(int[] arr) {
        int size = arr.length;
        int numOfSorted = 0;
        while (numOfSorted < size) {
            int boundary = size - numOfSorted - 1;
            for (int i = 0; i < boundary; i++) {
                if (arr[i] > arr[i + 1]) {
                    SortHelper.swap(arr, i, i + 1);
                }
            }
            numOfSorted++;
        }
        return arr;
    }
}
