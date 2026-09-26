/*
    
LEETCODE PROBLEM NUMBER 643

Maximum Average Subarray I

You are given an integer array nums consisting of n elements,
and an integer k.

Find a contiguous subarray whose length is equal to k
that has the maximum average value and return this value.

Any answer with a calculation error less than 10^-5 will be accepted.

Example 1:
Input:
nums = [1,12,-5,-6,50,3]
k = 4

Output:
12.75000

Example 2:
Input:
nums = [5]
k = 1

Output:
5.00000

*/

package SLIDINGWINDOW.FIXEDSIZE;

public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
         int windowSum=0;

       for(int i=0;i<k;i++){
        windowSum+=nums[i];
       }
       int maxSum=windowSum;

       for(int i=k;i<nums.length;i++){
        windowSum+=nums[i]-nums[i-k];

        maxSum=Math.max(maxSum,windowSum);
       }
       return (double)maxSum/k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double ans = findMaxAverage(nums, k);

        System.out.println(ans);
    }
}