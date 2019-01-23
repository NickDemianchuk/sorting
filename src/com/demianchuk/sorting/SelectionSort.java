package com.demianchuk.sorting;

public class SelectionSort implements Sortable {
    @Override
    public int[] sort(int[] arr) {
        int numOfUnsorted = arr.length;
        int i;
        int max;
        while (numOfUnsorted > 0) {
            max = 0;
            for (i = 1; i < numOfUnsorted; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            SortHelper.swap(arr, max, numOfUnsorted - 1);
            numOfUnsorted--;
        }
        return arr;
    }
}
