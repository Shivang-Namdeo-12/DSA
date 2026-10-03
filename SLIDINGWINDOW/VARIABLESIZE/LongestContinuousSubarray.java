/*
LEETCODE PROBLEM NUMBER 1438

Title:
Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

Problem:
Given an integer array nums and an integer limit, return the size
of the longest non-empty subarray such that the absolute difference
between any two elements is less than or equal to limit.

In simple words:
For every window, we need:

maximum element - minimum element <= limit

We have to find the longest valid window.

Examples:

Example 1:
Input:
nums = [8,2,4,7]
limit = 4

Output:
2

Example 2:
Input:
nums = [10,1,2,4,7,2]
limit = 5

Output:
4

Example 3:
Input:
nums = [4,2,2,2,4,4,2,2]
limit = 0

Output:
3
*/

package SLIDINGWINDOW.VARIABLESIZE;

public class LongestContinuousSubarray {

    public static int longestSubarray(int[] nums, int limit) {

        int left = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            // Find min and max in current window
            for (int j = left; j <= i; j++) {

                if (nums[j] > max) {
                    max = nums[j];
                }

                if (nums[j] < min) {
                    min = nums[j];
                }
            }

            // Window is invalid
            if (max - min > limit) {
                left++;
            }

            // Window is valid
            else {
                ans = Math.max(ans, i - left + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {8, 2, 4, 7};
        int limit = 4;

        int ans = longestSubarray(nums, limit);

        System.out.println(ans);
    }
}