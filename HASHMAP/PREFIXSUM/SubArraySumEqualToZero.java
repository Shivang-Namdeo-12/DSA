/*


You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.

Examples:

Input: arr[] = [0, 0, 5, 5, 0, 0]
Output: 6
Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].
Input: arr[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7]
Output: 4
Explanation: The 4 subarrays are [-1, -3, 4], [-2, 2], [2, 4, 6, -12], 
and [-1, -3, 4, -2, 2]
Input: arr[] = [0]
Output: 1
Explanation: The only subarray is [0].


*/






package HASHMAP.PREFIXSUM;

import java.util.HashMap;

public class SubArraySumEqualToZero {
     public static int findSubarray(int[] nums) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum)){
                count=count+map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
    public static void main(String[] args) {
    int nums[]={0,0,5,5,0,0};
    
    System.out.println(findSubarray(nums));
}
}
