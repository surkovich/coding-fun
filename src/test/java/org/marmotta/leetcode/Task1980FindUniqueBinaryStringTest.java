package org.marmotta.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1980FindUniqueBinaryStringTest {

    Task1980FindUniqueBinaryString.Solution solution = new Task1980FindUniqueBinaryString.Solution();

    @Test
    void case1() {
        checkInput(new String[]{"01", "10"});
    }

    @Test
    void case2() {
        checkInput(new String[]{"00", "01"});
    }

    @Test
    void case3() {
        checkInput(new String[]{"111", "011", "001"});
    }

    @Test
    void case113() {
        checkInput(new String[]{"0101001011011", "1100100101111", "1111000100000", "0101000101000", "1011111100000",
                "0110110101101", "0010000111111", "1111001101000", "1011101100010", "1010101111011", "1000010110100",
                "0101001111101", "0100000011110"});
    }

    private void checkInput(String[] input) {
        String result = solution.findDifferentBinaryString(input);
        System.out.println(result);
        assertEquals(result.length(), input.length);
        assertFalse(Arrays.asList(input).contains(result));
    }

    @Test
    void tt() {
        System.out.println(String.format("%03d", 0));
    }

}