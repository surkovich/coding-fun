package org.marmotta.leetcode;

import java.util.Arrays;

import static org.marmotta.common.BinarySearch.biSearch;

public class Task3634MinimumRemovalsToBalanceArray {

    static class Solution {
        public int minRemoval(int[] nums, int k) {
            Arrays.sort(nums);
            int i = 0;
            int j = biSearch(nums, nums[0] * k);

            int longestSubarray = j - i;

            do {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }

                if (i == nums.length - 1) {
                    break;
                }

                j = biSearch(nums, nums[i] * k);
                longestSubarray = Math.max(longestSubarray, j - i);
            } while (j < nums.length - 1);

            return nums.length - longestSubarray;
        }
    }

}
