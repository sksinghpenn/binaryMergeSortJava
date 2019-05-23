package com.lifotech.java.binaryMergeSort;


import java.util.List;

import java.util.Vector;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The class deals with the methods related to the home assignment.
 *
 * @author SK Singh
 */

public class HiringAssignment {

    // Problem #1
    //
    // Write a function that returns an vector of all the prime numbers
    // up to the max specified by the argument.

    /**
     * The method returns list of prime numbers.
     *
     * @param max
     * @return {@link Vector} of prime numbers
     */
    public static Vector<Integer> primeNumbers(int max) {

        List<Integer> primeList = IntStream.rangeClosed(2, max)
                .filter(x -> isPrime(x)).boxed()
                .collect(Collectors.toList());

        return new Vector<>(primeList);

    }


    /**
     * The method returns if the number is prime.
     * <p>
     * Two conditions must be true for a number to be a prime:
     * 1. It should be divisible by 1.
     * 2. It should be divisible by itself.
     * <p>
     * <p>
     * When a number is not a prime, it can be factored into two factors
     * as number = x * y.
     * <p>
     * To find if the number is prime, from 2 to the square root of the number, check if each  number can divide the input number.
     *
     * @param number
     * @return true if the number is prime otherwise return false.
     */
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    // Problem #2
    //
    // Given two vectors of integers, find the intersection. Return the vector of
    // intersecting values.

    /**
     * The method returns intersetion of two collections.
     *
     * @param a1
     * @param a2
     * @return {@link Vector} intersection of two collections
     */
    public static Vector<Integer> arrayIntersection(Vector<Integer> a1, Vector<Integer> a2) {

        // convert them into array
        int[] a1Array = a1.stream().mapToInt(i -> i).toArray();
        int[] a2Array = a2.stream().mapToInt(i -> i).toArray();

        if (a1Array.length > a2Array.length) {
            return getIntersection(a1Array, a2Array);
        } else {
            return getIntersection(a2Array, a1Array);
        }


    }

    private static Vector<Integer> getIntersection(int[] a1Array, int[] a2Array) {
        Vector<Integer> intersectionElements = new Vector<>();

        // merge sort(nlogn) the smaller array
        new MergeSort().sort(a2Array);
        // Search every element of bigger array in smaller array
        // and add the found into the  the element if found
        for (int i = 0; i < a1Array.length; i++) {
            if (BinarySearchUtil.binarySearch(a2Array, a1Array[i]) != -1)
                intersectionElements.add(a1Array[i]);
        }
        return intersectionElements;
    }

}
