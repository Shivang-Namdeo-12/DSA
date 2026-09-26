/*
    
LEETCODE PROBLEM NUMBER 1343

Number of Sub-arrays of Size K and Average Greater than
or Equal to Threshold

Given an array of integers arr and two integers k and threshold,
return the number of sub-arrays of size k whose average is greater
than or equal to threshold.

Example 1:

Input:
arr = [2,2,2,2,5,5,5,8]
k = 3
threshold = 4

Output:
3

Explanation:
[2,5,5] → average = 4
[5,5,5] → average = 5
[5,5,8] → average = 6


Example 2:

Input:
arr = [1,1,1,1,1]
k = 1
threshold = 0

Output:
5

*/

package SLIDINGWINDOW.FIXEDSIZE;

public class NumberOfSubArraysOfSizeKandAverageGreaterThanorEqualToThreshold {

    public static int numOfSubarrays(int[] nums, int k, int threshold) {

        int windowSum = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Check first window
        if (windowSum / k >= threshold) {
            count++;
        }

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            windowSum += nums[i] - nums[i - k];

            if (windowSum / k >= threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        int ans = numOfSubarrays(nums, k, threshold);

        System.out.println(ans);
    }
}