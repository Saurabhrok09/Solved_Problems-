package com.test.array;

import java.util.Arrays;

public class MaxSubarrayWithElements {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int[] result = findMaxSubarray(nums);
        System.out.println("Maximum Subarray: " + Arrays.toString(result));
    }

    public static int[] findMaxSubarray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        int start = 0, end = 0, tempStart = 0;  // Temporary start index to track the beginning of the current subarray

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Extract subarray from start to end
        return Arrays.copyOfRange(nums, start, end + 1);
    }
}