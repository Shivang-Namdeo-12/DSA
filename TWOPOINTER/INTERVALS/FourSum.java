/*






LEETCODE PROBLEM NUMBER 18









Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 












*/






package TWOPOINTER.INTERVALS;

import java.util.*;


public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

       List<List<Integer>>ans=new ArrayList<>();
       Arrays.sort(nums);

       for(int i=0;i<nums.length-3;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        for(int j=i+1;j<nums.length-2;j++){
            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
            int left=j+1;
            int right=nums.length-1;

            while(left<right){
                List<Integer>temp=new ArrayList<>();
                int sum=nums[i]+nums[j]+nums[left]+nums[right];

                if(sum==target){
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                        
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                    ans.add(temp);
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
       }
       return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println(result);
    }
}
