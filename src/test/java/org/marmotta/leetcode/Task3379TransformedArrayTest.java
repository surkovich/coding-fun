package org.marmotta.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3379TransformedArrayTest {

    Task3379TransformedArray.Solution instance  = new Task3379TransformedArray.Solution();

    @Test
    void case1() {
        assertArrayEquals(new int[]{1,1,1,3}, instance.constructTransformedArray(new int[]{3,-2,1,1}));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{-1,-1,4}, instance.constructTransformedArray(new int[]{-1, 4, -1}));
    }

}