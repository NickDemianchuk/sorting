package com.demianchuk.sorting;

public class SortHelper {
    private SortHelper() {
    }

    protected static void swap(int[] arr, int i, int j) {
        // swapping without a temp variable
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }

    protected static void print(int[] arr) {
        StringBuffer output = new StringBuffer();
        output.append("[ ");
        for (int a : arr) {
            output.append(a);
            output.append(" ");
        }
        output.append("]");
        System.out.println(output.toString());
    }
}
