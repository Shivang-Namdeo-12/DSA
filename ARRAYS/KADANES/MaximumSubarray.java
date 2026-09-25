package KADANES;
//LEETCODE PROBLEM NUMBER 53
public class MaximumSubarray {
     public static int maxSubArray(int[] nums) {

       /* int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                max = Math.max(max, sum);
            }
        }

        return max;*/







        int max = nums[0];
        int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {

            curr = Math.max(curr + nums[i], nums[i]);

            max = Math.max(max, curr);
        }

        return max;


    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));
}
}