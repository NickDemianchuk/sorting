package com.demianchuk.sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] initial = {6, 7, 12, 4, 6, -2, 7, 3};
        int[] sorted = bubbleSort(initial);
        print(sorted);
    }

    public static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        int numOfSorted = 0;
        while (numOfSorted < size) {
            int boundary = size - numOfSorted - 1;
            for (int i = 0; i < boundary; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            numOfSorted++;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        // swapping without a temp variable
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }

    public static void print(int[] arr) {
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
