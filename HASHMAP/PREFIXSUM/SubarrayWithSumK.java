/*


LEETCODE PROBLEM NUMBER 560

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2


*/











package HASHMAP.PREFIXSUM;

import java.util.HashMap;
public class SubarrayWithSumK {
    public static int subarraySum(int nums[],int k){
    HashMap<Integer,Integer> map=new HashMap<>();

    map.put(0,1);
    int sum=0;
    int count=0;

    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        int required=sum-k;

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
    int nums[]={1,2,3,-2,5};
    int k=5;
    System.out.println(subarraySum(nums,k));
}
}
