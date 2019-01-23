package com.demianchuk.sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] initial = {6, 7, 12, 4, 6, -2, 7, 3};
        Sortable bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(initial);
        SortHelper.print(sorted);
    }
}
