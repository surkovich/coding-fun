package org.marmotta.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task3634MinimumRemovalsToBalanceArrayTest {
    Task3634MinimumRemovalsToBalanceArray.Solution instance = new Task3634MinimumRemovalsToBalanceArray.Solution();

    @Test
    void case1() {
        assertEquals(1, instance.minRemoval(new int[]{2, 1, 5}, 2));
    }

    @Test
    void case2() {
        assertEquals(2, instance.minRemoval(new int[]{1,6,2,9}, 3));
    }



    // additional
    @Test
    void binarySearchZeroes() {
        System.out.println(Arrays.binarySearch(new int[]{0,0,0,0,0,2}, 2));
    }

}