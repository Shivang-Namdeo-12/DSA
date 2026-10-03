/*

LEETCODE PROBLEM NUMBER 1493

Longest Subarray of 1's After Deleting One Element

Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's
after deleting exactly one element.

Example 1:
Input: nums = [1,1,0,1]
Output: 3
Explanation:
After deleting 0, the array becomes [1,1,1].
The longest subarray of 1's has length 3.

Example 2:
Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation:
After deleting one 0, the longest subarray of 1's has length 5.

Example 3:
Input: nums = [1,1,1]
Output: 2
Explanation:
We must delete exactly one element, so the answer is 2.

Constraints:
1 <= nums.length <= 10^5
nums[i] is either 0 or 1.

Pattern:
Sliding Window

Sub-Pattern:
Array → Variable Size Window

*/

package SLIDINGWINDOW.VARIABLESIZE;

public class LongestSubarrayOfOnes {

    public static int longestSubarray(int[] nums) {
        int zeroes=0;
        int maxLength=0;
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
            maxLength=Math.max(maxLength,i-left);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1};

        int ans = longestSubarray(nums);

        System.out.println(ans);
    }
}