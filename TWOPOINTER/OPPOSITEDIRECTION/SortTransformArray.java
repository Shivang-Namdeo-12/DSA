/*






LEETCODE PROBLEM NUMBER 360









You are given a sorted integer array nums and three integers a, b, and c.

For every element x, calculate:

f(x) = a*x² + b*x + c

Then return all transformed values in sorted increasing order.

Example
Input:
nums = {-4, -2, 2, 4}
a = 1
b = 3
c = 5

Transformed values:

-4 → 9
-2 → 3
 2 → 15
 4 → 33

After sorting:

Output:
[3, 9, 15, 33]




*/






package TWOPOINTER.OPPOSITEDIRECTION;

import java.util.Arrays;

public class SortTransformArray {
     public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
      /*   int ans[]=new int[nums.length];
        

        for(int i=0;i<nums.length;i++){
            int fn=a*nums[i]*nums[i]+b*nums[i]+c;

            ans[i]=fn;
        }

        Arrays.sort(ans);
        return ans;
        */

         int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;

        // a >= 0 → largest values edges par
        if (a >= 0) {

            int pos = n - 1;

            while (left <= right) {

                int leftValue = a * nums[left] * nums[left]
                              + b * nums[left] + c;

                int rightValue = a * nums[right] * nums[right]
                               + b * nums[right] + c;

                if (leftValue > rightValue) {
                    ans[pos] = leftValue;
                    left++;
                } else {
                    ans[pos] = rightValue;
                    right--;
                }

                pos--;
            }

        } 
        // a < 0 → smallest values edges par
        else {

            int pos = 0;

            while (left <= right) {

                int leftValue = a * nums[left] * nums[left]
                              + b * nums[left] + c;

                int rightValue = a * nums[right] * nums[right]
                               + b * nums[right] + c;

                if (leftValue < rightValue) {
                    ans[pos] = leftValue;
                    left++;
                } else {
                    ans[pos] = rightValue;
                    right--;
                }

                pos++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -2, 2, 4};
        int a = 1;
        int b = 3;
        int c = 5;

        int[] result = sortTransformedArray(nums, a, b, c);

        System.out.println(Arrays.toString(result));
    }
}
