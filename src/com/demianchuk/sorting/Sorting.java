package com.demianchuk.sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] initial = {6, 7, 12, 4, 6, -2, 7, 3};
        Sortable selectionSort = new SelectionSort();
        int[] sorted = selectionSort.sort(initial);
        SortHelper.print(sorted);
    }
}
