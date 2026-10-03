/*
    
LEETCODE PROBLEM NUMBER 713

Subarray Product Less Than K

Given an array of positive integers nums and an integer k, return the
number of contiguous subarrays where the product of all the elements
in the subarray is strictly less than k.

Example 1:
Input: nums = [10,5,2,6], k = 100
Output: 8

Example 2:
Input: nums = [1,2,3], k = 0
Output: 0

*/

package SLIDINGWINDOW.VARIABLESIZE;

public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            product *= nums[i];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += i - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;

        int ans = numSubarrayProductLessThanK(nums, k);

        System.out.println(ans);
    }
}