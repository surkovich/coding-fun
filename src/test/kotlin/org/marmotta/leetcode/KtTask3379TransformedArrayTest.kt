package org.marmotta.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class KtTask3379TransformedArrayTest {

    val instance: KtTask3379TransformedArray.Solution = KtTask3379TransformedArray.Solution()

    @Test
    fun case1() {
        assertArrayEquals(intArrayOf(1, 1, 1, 3), instance.constructTransformedArray(intArrayOf(3, -2, 1, 1)))
    }

    @Test
    fun case2() {
        assertArrayEquals(intArrayOf(-1, -1, 4), instance.constructTransformedArray(intArrayOf(-1, 4, -1)))
    }


}