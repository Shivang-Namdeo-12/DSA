/*
    
LEETCODE PROBLEM NUMBER 209

Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target,
return the minimal length of a contiguous subarray whose sum is greater
than or equal to target.

If there is no such subarray, return 0.

Example 1:

Input:
target = 7
nums = [2,3,1,2,4,3]

Output:
2

Explanation:
The subarray [4,3] has the smallest length = 2.


Example 2:

Input:
target = 4
nums = [1,4,4]

Output:
1


Example 3:

Input:
target = 11
nums = [1,1,1,1,1,1,1,1]

Output:
0

*/

package SLIDINGWINDOW.VARIABLESIZE;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            windowSum += nums[i];

            while (windowSum >= target) {

                minLength = Math.min(minLength, i - left + 1);

                windowSum -= nums[left];

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int ans = minSubArrayLen(target, nums);

        System.out.println(ans);
    }
}