package org.marmotta.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3637TrionicArrayITest {

    Task3637TrionicArrayI.Solution instanse = new Task3637TrionicArrayI.Solution();

    @Test
    void empty() {

    }

    @Test void case1() {
        assertTrue(instanse.isTrionic(new int[]{1,3,5,4,2,6}));
    }

    @Test void cases2() {
        assertFalse(instanse.isTrionic(new int[]{2,1,3}));
    }

    @Test void case3() {
        assertFalse(instanse.isTrionic(new int[]{1, 2, 3}));
    }

}