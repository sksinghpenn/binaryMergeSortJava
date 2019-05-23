package com.lifotech.java.binaryMergeSort;


/**
 * The class encapsulates the MergeSort functionality.
 *
 * @author SK Singh
 */
public class MergeSort {


    private int[] arr; // holds the original array
    private int[] tempArr; // used as helper array
    private int length; // holds the length of the original array

    /**
     * Sorts the array in-place
     *
     * @param arr
     */
    public void sort(int[] arr) {
        this.arr = arr;
        this.tempArr = new int[arr.length];

        mergeSort(0, arr.length - 1);
    }

    private void mergeSort(int low, int high) {

        // use recursion till we left a single element, which is the base case
        if (low < high) {
            int mid = low + (high - low) / 2;

            // sort the left side using recursion
            mergeSort(low, mid);

            // sort the right side using recursion
            mergeSort(mid + 1, high);

            //merge left and right side
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {

        // copy the array into to temp array
        for (int i = low; i <= high; i++) {
            tempArr[i] = arr[i];
        }

        // create local variables to i, j, k to hold inital values
        int i = low;
        int j = mid + 1;
        int k = low;

        // copy the smallest values from the right side back to the original array
        while (i <= mid && j <= high) {

            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        // copy the rest of the left side of the array into the original array
        while (i <= mid) {

            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }
}



