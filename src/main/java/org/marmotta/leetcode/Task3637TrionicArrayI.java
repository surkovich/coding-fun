package org.marmotta.leetcode;

public class Task3637TrionicArrayI {

    public static class Solution {
        public boolean isTrionic(int[] nums) {

            if (nums[0] >= nums[1]) {
                return false;
            }
            int sign = 1;
            int turns = 1;
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return false;
                }
                if ((nums[i] - nums[i - 1]) * sign < 0) {
                    turns++;
                    sign = -sign;
                }
//                System.out.println("i = " + i + ", sign = " + sign + ", turns = " + turns);
            }

            return turns == 3;
        }
    }

}
