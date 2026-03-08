package org.marmotta.leetcode;

import java.util.Arrays;

public class Task1980FindUniqueBinaryString {

    static class Solution {
        public String findDifferentBinaryString(String[] nums) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i].charAt(i) == '0') {
                    sb.append('1');
                } else {
                    sb.append('0');
                }
            }
            return sb.toString();
        }
    }

    static class Solution1 {
        private String format;
        public String findDifferentBinaryString(String[] nums) {
            Arrays.sort(nums);
            format = "%" + nums.length + "s";
            int index = 0;
            int check = 0;
            while (true) {
                String val = binaryValue(check);
                if (index == nums.length) {
                    return val;
                }
                if (val.equals(nums[index])) {
                    index++;
                    check++;
                    continue;
                }
                return val;
            }
        }

        private String binaryValue(int val) {
            return String.format(format, Integer.toBinaryString(val)).replace(' ', '0');
        }
    }

}
