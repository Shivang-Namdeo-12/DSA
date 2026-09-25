/*


LEETCODE PROBLEM NUMBER 930



Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15

*/




package HASHMAP.PREFIXSUM;

import java.util.HashMap;

public class BinarySubarraySum {
     public static int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int required=sum-goal;
            if(map.containsKey(required)){
                count=count+map.get(required);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
      public static void main(String[] args) {
    int nums[]={1,0,1,0,1};
    int goal=2;
    System.out.println(numSubarraysWithSum(nums,goal));
}
}
