package com.lifotech.java.binaryMergeSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

/**
 * Class implements unit tests for {@link HiringAssignment}
 */
public class HiringAssignmentTest {

    @Test
    public void testIsPrime() {
        Vector<Integer> result  = HiringAssignment.primeNumbers(10);

        Assert.assertEquals(Arrays.asList(2,3,5,7),result);
    }

    @Test
    public void testArrayIntersection() {

        // Problem 2
        Vector<Integer> inter1 = new Vector<Integer>();
        inter1.add(1);
        inter1.add(2);
        inter1.add(3);
        inter1.add(25);
        Vector<Integer> inter2 = new Vector<Integer>();
        inter2.add(2);
        inter2.add(3);
        inter2.add(15);
        inter2.add(25);



        Vector<Integer> intersect = HiringAssignment.arrayIntersection(inter1, inter2);
        Assert.assertArrayEquals(new Integer[]{2,3,25}, intersect.toArray());
    }

}
