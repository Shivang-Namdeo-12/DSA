/*
    
LEETCODE PROBLEM NUMBER 1695

Maximum Erasure Value

You are given an array of positive integers nums.

You may choose one subarray and erase it. 
You get points equal to the sum of the elements in the subarray.

Return the maximum points you can get.

An array is a subarray if it is a contiguous sequence of elements
within the array.

You can erase only one subarray, and the subarray must contain
unique elements.

Example 1:
Input: nums = [4,2,4,5,6]
Output: 17
Explanation:
The optimal subarray is [2,4,5,6], whose sum is 17.

Example 2:
Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation:
The optimal subarray is [5,2,1], whose sum is 8.

Constraints:
1 <= nums.length <= 10^5
1 <= nums[i] <= 10^4

Pattern:
Sliding Window

Sub-Pattern:
Array → Variable Size Window

*/

package SLIDINGWINDOW.VARIABLESIZE;

import java.util.HashSet;

public class MaximumErasureValue {

    public static int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int sum=0;
        int max=0;
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[i]);
            sum+=nums[i];

            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 4, 5, 6};

        int ans = maximumUniqueSubarray(nums);

        System.out.println(ans);
    }
}