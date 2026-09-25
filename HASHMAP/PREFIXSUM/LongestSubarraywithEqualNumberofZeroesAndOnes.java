/*


LEETCODE PROBLEM NUMBER 525



Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Example 3:

Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.





*/







package HASHMAP.PREFIXSUM;

import java.util.HashMap;

public class LongestSubarraywithEqualNumberofZeroesAndOnes {
     public static int findMaxLength(int[] nums) {
        int maxLength=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;
            }
            else{
                sum=sum+1;
            }

            if(map.containsKey(sum)){
                int length=i-map.get(sum);
                maxLength=Math.max(maxLength,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
     public static void main(String[] args) {
    int nums[]={0,1,1,1,1,0,0,0};
    System.out.println(findMaxLength(nums));
}
}
