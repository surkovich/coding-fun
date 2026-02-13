package org.marmotta.leetcode;

public class Task3379TransformedArray {

    public static class Solution {
        public int[] constructTransformedArray(int[] nums) {

            int length = nums.length;
            int[] res = new int[length];
            for (int i = 0; i < length; i++) {
                res[i] = nums[targetIndex(i + nums[i], length)];
            }

            return res;
        }

        public int targetIndex(int index, int length) {
            return ((index % length) + length) % length;
        }
    }

}
