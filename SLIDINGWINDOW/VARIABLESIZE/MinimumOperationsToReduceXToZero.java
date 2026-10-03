/*
    
LEETCODE PROBLEM NUMBER 1658

Minimum Operations to Reduce X to Zero

You are given an integer array nums and an integer x.

In one operation, you can remove the leftmost or rightmost element
from the array and subtract its value from x.

Return the minimum number of operations to reduce x to exactly 0.

If it is impossible, return -1.

Example 1:
Input: nums = [1,1,4,2,3], x = 5
Output: 2

Example 2:
Input: nums = [5,6,7,8,9], x = 4
Output: -1

Example 3:
Input: nums = [3,2,20,1,1,3], x = 10
Output: 5

*/

package SLIDINGWINDOW.VARIABLESIZE;

public class MinimumOperationsToReduceXToZero {

    public static int minOperations(int[] nums, int x) {

        // Step 1: Find total sum
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        // Step 2: Remaining subarray target
        int target = total - x;

        // If target is negative, impossible
        if (target < 0) {
            return -1;
        }

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        // Step 3: Find longest subarray with sum = target
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // Shrink window
            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            // Target found
            if (sum == target) {
                maxLength = Math.max(
                    maxLength,
                    right - left + 1
                );
            }
        }

        // No valid subarray
        if (maxLength == -1) {
            return -1;
        }

        // Step 4: Minimum operations
        return nums.length - maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 4, 2, 3};
        int x = 5;

        int ans = minOperations(nums, x);

        System.out.println(ans);
    }
}