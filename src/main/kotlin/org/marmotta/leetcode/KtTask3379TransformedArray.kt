package org.marmotta.leetcode

class KtTask3379TransformedArray {
    class Solution {
        fun constructTransformedArray(nums: IntArray): IntArray {
            val length = nums.size

            val res: IntArray =
                nums.mapIndexed { index, i -> nums[targetIndex(index + nums[index], length)] }.toIntArray()

            return res
        }

        fun targetIndex(index: Int, length: Int): Int =
            ((index % length) + length) % length

    }

}