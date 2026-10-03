/*
LEETCODE PROBLEM NUMBER 2302

Title:
Count Subarrays With Score Less Than K

Pattern:
Sliding Window

Sub-pattern:
Array -> Variable Size Window

Problem:
Given a positive integer array nums.

The score of a subarray is:

score = sum of the subarray * length of the subarray

Return the number of non-empty subarrays whose score
is strictly less than k.

Example 1:

Input:
nums = [2,1,4,3,5]
k = 10

Output:
6

Example 2:

Input:
nums = [1,1,1]
k = 5

Output:
5
*/

package SLIDINGWINDOW.VARIABLESIZE;

public class CountSubarraysWithScoreLessThanK {

    public static long countSubarrays(int[] nums, long k) {
        int left=0;
        long count=0;
        long sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            while(sum*(i-left+1)>=k){
                sum-=nums[left];
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 4, 3, 5};
        long k = 10;

        long ans = countSubarrays(nums, k);

        System.out.println(ans);
    }
}