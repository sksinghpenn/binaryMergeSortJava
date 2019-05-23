package com.lifotech.java.binaryMergeSort;


import org.junit.Assert;
import org.junit.Test;

/**
 * Class  implements unit tests for the {@link MergeSort}
 */
public class MergeSortTest {

    @Test
    public void testSort_whenArrIsNotEmpty() {
        int[] arr = {1, 5, 10, 7};

        new MergeSort().sort(arr);

        Assert.assertArrayEquals(arr, new int[]{1,5,7,10});
    }

    @Test
    public void testSort_whenListIsEmpty() {
        int[] arr = {};

        new MergeSort().sort(arr);

        Assert.assertArrayEquals(arr, new int[]{});
    }
}
