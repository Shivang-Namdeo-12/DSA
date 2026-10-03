/*
LEETCODE PROBLEM NUMBER 487

Title:
Max Consecutive Ones II

Pattern:
Sliding Window
Sub-pattern:
Array -> Variable Size Window

Problem:
Given a binary array nums, return the maximum number
of consecutive 1s in the array if you can flip at most
one 0.

Examples:

Example 1:
Input:
nums = [1,0,1,1,0]

Output:
4

Example 2:
Input:
nums = [1,0,1,1,0,1]

Output:
4
*/

package SLIDINGWINDOW.VARIABLESIZE;

public class MaxConsecutiveOnesII {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int zeroes=0;
                int max=0;
        int left=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
        


     
            while(zeroes>1){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            
            max=Math.max(max,i-left+1);
        }
        
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 0};

        int ans = findMaxConsecutiveOnes(nums);

        System.out.println(ans);
    }
}