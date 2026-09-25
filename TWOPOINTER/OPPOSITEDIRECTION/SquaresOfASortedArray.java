/*






LEETCODE PROBLEM NUMBER 977









Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 















*/






package TWOPOINTER.OPPOSITEDIRECTION;

import java.util.Arrays;;
public class SquaresOfASortedArray {
     public static int[] sortedSquares(int[] nums) {
       /*  int i=0;
       // int ans[]=new int[nums.length];
        for(int j=0;j<nums.length;j++){
            int square=nums[j]*nums[j];
            nums[i]=square;
            i++;
        }
        Arrays.sort(nums);

        return nums;

*/

   int left=0;
   int right=nums.length-1;
   int i=nums.length-1;
   int ans[]=new int[nums.length];

   while(left<=right){
    if(Math.abs(nums[left])>Math.abs(nums[right])){
        ans[i]=nums[left]*nums[left];
        left++;
        
    }
    else{
        ans[i]=nums[right]*nums[right];
        right--;
      
    }
    i--;
   }
   return ans;

    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares( nums)));
    }
}
