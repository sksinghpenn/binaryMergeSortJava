package com.lifotech.java.binaryMergeSort;

import java.util.Vector;

/**
 * This is a driver class to test the basic functionaly of the {@link HiringAssignment} class.
 * @author SK Singh
 */
public class HiringAssignmentDriver {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        // Problem 1
        Vector<Integer> primes = HiringAssignment.primeNumbers(100);
        System.out.println(primes);

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
        System.out.println(intersect);
    }

}
