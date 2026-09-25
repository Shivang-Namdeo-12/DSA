/*






LEETCODE PROBLEM NUMBER 16









You are given an integer array nums of length n and an integer target.

Find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 









*/

import java.util.Arrays;

public class ThreeSumClosest {
     public static int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int closest=nums[0]+nums[1]+nums[2];

       for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while(left<right){

             int sum=nums[i]+nums[left]+nums[right];
             
             if(Math.abs(sum-target)<Math.abs(closest-target)){
                closest=sum;
             }

       if(sum<target){
        left++;
       }
       else if(sum>target){
        right--;
       }
       else{
        return sum;
       }
        }
       }
    
    return closest;
    }
    public static void main(String[] args) {

        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int ans = threeSumClosest(nums, target);

        System.out.println(ans);
    }
}
