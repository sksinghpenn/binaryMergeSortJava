package com.lifotech.java.binaryMergeSort;

import java.util.List;

/**
 * The utility class to handle binary search.
 */
public class BinarySearchUtil {


    /**
     * Returns the index of the element if found otherwise returns -1
     *
     * @param arr
     * @param val
     * @return the index of the element if found otherwise returns -1
     */
    public static int binarySearch(int[] arr, int val) {
        return binarySearch(arr, 0, arr.length, val);
    }

    /**
     * Returns the index of the element if found otherwise returns -1
     *
     * @param list
     * @param val
     * @return the index of the element if found otherwise returns -1
     */
    public static int binarySearch(List<Integer> list, int val) {
        return binarySearch(list, 0, list.size(), val);
    }

    private static int binarySearch(int[] arr, int lowerBound, int upperBound, int val) {
        if (upperBound >= lowerBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            // got it
            if (arr[mid] == val) return mid;

            // travers to the left side of the mid point of array
            if (val < arr[mid]) {
                return binarySearch(arr, lowerBound, mid - 1, val);
            }

            // else traverse right side of mid point of the array
            return binarySearch(arr, mid + 1, upperBound, val);


        }

        return -1;

    }


    private static int binarySearch(List<Integer> list, int lowerBound, int upperBound, int val) {
        if (upperBound >= lowerBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            // got it
            if (list.get(mid) == val) return mid;

            // travers to the left side of the mid point of array
            if (val < list.get(mid)) {
                return binarySearch(list, lowerBound, mid - 1, val);
            }

            // else traverse right side of mid point of the array
            return binarySearch(list, mid + 1, upperBound, val);


        }

        return -1;

    }
}
