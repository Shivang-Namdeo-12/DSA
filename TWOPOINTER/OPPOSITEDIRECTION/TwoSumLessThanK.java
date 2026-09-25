/*






LEETCODE PROBLEM NUMBER 1099









Given an integer array nums and an integer k, find the maximum sum of two elements in the array such that:

nums[i] + nums[j] < k

where i != j.

If there is no such pair, return -1.

Example 1
Input:
nums = [34,23,1,24,75,33,54,8]
k = 60

Output:
58

Because:

34 + 24 = 58

and 58 < 60.

Example 2
Input:
nums = [10,20,30]
k = 15

Output:
-1

*/





package TWOPOINTER.OPPOSITEDIRECTION;
import java.util.Arrays;
public class TwoSumLessThanK {
     public static int twoSumLessThanK(int[] nums, int k) {

        Arrays.sort(nums);

        int left=0;
        int right=nums.length-1;
        int ans=0;
        int curr=0;

        while(left<right){
            int sum=nums[left]+nums[right];

            if(sum<k){
                curr=sum;
                ans=Math.max(curr,ans);
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {34, 23, 1, 24, 75, 33, 54, 8};
        int k = 60;

        int result = twoSumLessThanK(nums, k);

        System.out.println(result);
    }
}
