package KADANES;
//LEETCODE PROBLEM NUMBER 918
public class MaximumSumCircularArray {
     public static int maxSubarraySumCircular(int[] nums) {

                /*int n=nums.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum=0;

            for(int j=0;j<n;j++){
                int index=(i+j)%n;

                sum+=nums[index];

                max=Math.max(max,sum);
            }
        }
        return max;*/


        
        int total = nums[0];

        int currMax = nums[0];
        int maxSum = nums[0];

        int currMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            total += nums[i];

            // Kadane for Maximum Sum
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for Minimum Sum
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Return the maximum of normal and circular subarray
        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {

        int[] nums = {5, -3, 5};

        int answer = maxSubarraySumCircular(nums);

        System.out.println("Maximum Circular Subarray Sum = " + answer);
    }
}
