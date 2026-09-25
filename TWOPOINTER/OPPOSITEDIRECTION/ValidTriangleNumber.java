/*






LEETCODE PROBLEM NUMBER 611



Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

 

Example 1:

Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Example 2:

Input: nums = [4,2,3,4]
Output: 4




















*/




import java.util.Arrays;

public class ValidTriangleNumber {
    
    public static int triangleNumber(int[] nums) {

     /*    Arrays.sort(nums);
        int count=0;
        
        for(int right=nums.length-1;right>=2;right--){
            int left=0;
            int mid=right-1;

            while(left<mid){
                if(nums[left]+nums[mid]>nums[right]){
                    count+=mid-left;
                    mid--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
        */

                Arrays.sort(nums);

        int count = 0;

        for(int left = 0; left < nums.length - 2; left++) {

            int mid = left + 1;
            int right = nums.length - 1;

            while(mid < right) {

                if(nums[left] + nums[mid] > nums[right]) {
                    count += right - mid;
                    right--;
                }
                else {
                    mid++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 4};

        int ans = triangleNumber(nums);

        System.out.println(ans);
    }
}
