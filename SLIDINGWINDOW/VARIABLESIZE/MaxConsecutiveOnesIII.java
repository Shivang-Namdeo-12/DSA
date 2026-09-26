/*
    
LEETCODE PROBLEM NUMBER 1004

Max Consecutive Ones III

Given a binary array nums and an integer k, return the maximum number
of consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6

Example 2:
Input: nums = [0,0,1,1,1,0,0], k = 0
Output: 3

*/

package SLIDINGWINDOW.VARIABLESIZE;

public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {

        int zeroes = 0;
        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeroes++;
            }

            while (zeroes > k) {

                if (nums[left] == 0) {
                    zeroes--;
                }

                left++;
            }

            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int ans = longestOnes(nums, k);

        System.out.println(ans);
    }
}