package KADANES;

import java.util.Arrays;

//LEETCODE PROBLEM NUMBER 1005
public class MaximizeSumOfSubarrayAfterRemovingKNegativeElement {
    public static int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        // Flip negative numbers
        for (int i = 0; i < nums.length && k > 0; i++) {

            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        // Calculate sum and smallest absolute value
        for (int num : nums) {

            sum += num;
            min = Math.min(min, Math.abs(num));
        }

        // If k is odd, flip the smallest absolute value
        if (k % 2 == 1) {
            sum -= 2 * min;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {2, -3, -1, 5, -4};
        int k = 2;

        int ans = largestSumAfterKNegations(nums, k);

        System.out.println("Maximum Sum = " + ans);
    }
}
