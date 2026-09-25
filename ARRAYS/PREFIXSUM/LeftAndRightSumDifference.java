/*






LEETCODE PROBLEM NUMBER 2574



You are given a 0-indexed integer array nums of size n.

Define two arrays leftSum and rightSum where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 













*/






package PREFIXSUM;

public class LeftAndRightSumDifference {
     public static int[] leftRightDifference(int[] nums) {
      /*  int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        int[] ans=new int[nums.length];

        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            leftSum[i]=sum;
            sum=sum+nums[i];  
        }

        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            total=total-nums[i];
            rightSum[i]=total;
        }

        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;*/

        int ans[]=new int[nums.length];
        int prefix=0;
        int suffix=0;
        int total=0;
        
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            suffix=total-prefix;

            prefix+=nums[i];

            ans[i]=Math.abs(prefix-suffix);
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] nums = {10, 4, 8, 3};

        int[] ans = leftRightDifference(nums);

        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    
}
