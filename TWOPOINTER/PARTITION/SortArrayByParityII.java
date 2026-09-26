/*
    
LEETCODE PROBLEM NUMBER 922

Sort Array By Parity II

Given an integer array nums, half of the integers in nums are odd
and half of the integers in nums are even.

Sort the array so that whenever nums[i] is even, i is even,
and whenever nums[i] is odd, i is odd.

You may return any array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]

Example 2:
Input: nums = [2,3]
Output: [2,3]

*/

package TWOPOINTER.PARTITION;

public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {

        int j = 1;

        for (int i = 0; i < nums.length; i++) {

            // Even index par odd number aa gaya
            if (i % 2 == 0 && nums[i] % 2 != 0) {

                // Odd index par even number dhundo
                while (j < nums.length && nums[j] % 2 != 0) {
                    j += 2;
                }

                // Swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 5, 7};

        int[] ans = sortArrayByParityII(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}