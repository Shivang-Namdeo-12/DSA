/*
LEETCODE PROBLEM NUMBER 2958

Length of Longest Subarray With at Most K Frequency

You are given an integer array nums and an integer k.

A subarray is called good if the frequency of each element in the
subarray is less than or equal to k.

Return the length of the longest good subarray.

Example 1:

Input: nums = [1,2,3,1,2,3,1,2], k = 2

Output: 6

Example 2:

Input: nums = [1,2,1,2,1,2,1,2], k = 1

Output: 2

Example 3:

Input: nums = [5,5,5,5], k = 2

Output: 2
*/

package SLIDINGWINDOW.VARIABLESIZE;

import java.util.HashMap;

public class LengthOfLongestSubarrayWithAtMostKFrequency {

    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int left=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            while(map.get(nums[i])>k){
                 map.put(nums[i],map.get(nums[i])-1);
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;

        int ans = maxSubarrayLength(nums, k);

        System.out.println(ans);
    }
}