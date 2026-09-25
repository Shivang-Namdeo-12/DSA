package KADANES;
//LEETCODE PROBLEM NUMBER 152
public class MaximumProductSubArray {
     public static int maxProduct(int[] nums) {

      /*   int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int product = 1;

            for (int j = i; j < nums.length; j++) {

                product *= nums[j];

                max = Math.max(max, product);
            }
        }

        return max;*/





        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=max;

            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));

            min=Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*min));

            ans=Math.max(ans,max);
        }
        return ans;

        
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        int ans = maxProduct(nums);

        System.out.println("Maximum Product = " + ans);
    }
}
