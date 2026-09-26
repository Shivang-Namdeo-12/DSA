/*
    
LEETCODE PROBLEM NUMBER 350

Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays.

You may return the result in any order.


Example 1:

Input:
nums1 = [1,2,2,1]
nums2 = [2,2]

Output:
[2,2]


Example 2:

Input:
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]

Output:
[4,9]

Explanation:
[9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


Follow up:

What if the given array is already sorted?
How would you optimize your algorithm?

What if nums1's size is small compared to nums2's size?

What if elements of nums2 are stored on disk and the memory is limited?

*/

package TWOPOINTER.MERGE;

import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
         int i=0;
        int j=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        int ans[]=new int[Math.min(nums1.length,nums2.length)];

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans[k]=nums1[i];
                i++;
                j++;
                k++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOf(ans,k);
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}