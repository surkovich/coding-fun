package org.marmotta.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.marmotta.common.BinarySearch.biSearch;

class BinarySearchTest {

    @Test
    void search_existing_value() {
        assertEquals(2, biSearch(new int[]{0, 1, 2, 3, 4, 5}, 2));
        assertEquals(3, biSearch(new int[]{0, 1, 2, 3, 4, 5}, 3));
    }

    @Test
    void search_firsts_value() {
        assertEquals(0, biSearch(new int[]{0, 1, 2, 3, 4, 5}, 0));
    }

    @Test
    void search_lasts_value() {
        assertEquals(5, biSearch(new int[]{0, 1, 2, 3, 4, 5}, 5));
    }

    @Test
    void search_non_existing_in_the_middle() {
        assertEquals(2, biSearch(new int[]{0, 1, 1, 3, 4, 5}, 2));
        assertEquals(3, biSearch(new int[]{0, 1, 1, 1, 4, 5}, 2));
    }

    @Test
    void search_too_small_for_first() {
        assertEquals(0, biSearch(new int[]{0, 1, 2, 3, 4, 5}, -1));
    }

    @Test
    void search_too_big_for_last() {
        assertEquals(5, biSearch(new int[]{0, 1, 2, 3, 4, 5}, 6));
    }

    @Test
    void searchInZeroes(){
        assertEquals(4, biSearch(new int[]{0, 0, 0, 0, 0, 5}, 1));
    }
}