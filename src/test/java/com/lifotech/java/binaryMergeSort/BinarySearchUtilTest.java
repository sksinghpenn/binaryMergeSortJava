package com.lifotech.java.binaryMergeSort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class implements unit tests for {@link BinarySearchUtil}
 */
public class BinarySearchUtilTest {


    @Test
    public void testBinarySearch_whenElementExistInTheList() {
        int[] arr = {1, 5, 10, 7};

        int foundIndex = BinarySearchUtil.binarySearch(arr, 5);

        Assert.assertEquals(1, foundIndex);

    }

    @Test
    public void testBinarySearch_whenElementDoesNotExistInTheList() {
        int[] arr = {1, 5, 10, 7};

        int foundIndex = BinarySearchUtil.binarySearch(arr, 6);

        Assert.assertEquals(-1, foundIndex);

    }


}
