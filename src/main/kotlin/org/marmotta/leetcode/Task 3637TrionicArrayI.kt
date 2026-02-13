package org.marmotta.leetcode

class KtTask3637TrionicArrayI {
    class Solution {

        fun isTrionic(nums: IntArray): Boolean {
            if (nums[0] >= nums[1]) {
                return false
            }
            var turns = 1

            var sign = 1
            for (i in 2..<nums.size) {
                if (nums[i] == nums[i - 1]) {
                    return false
                }
                if ((nums[i] - nums[i - 1]) * sign < 0) {
                    turns++
                    sign = -sign
                }
            }

            return turns == 3
        }



    }
}
