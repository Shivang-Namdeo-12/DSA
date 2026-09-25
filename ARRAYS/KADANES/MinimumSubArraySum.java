package KADANES;

public class MinimumSubArraySum {
    public static int minSubarray(int nums[]){
        int min=nums[0];
        int curr=nums[0];

        for(int i=1;i<nums.length;i++){
            curr=Math.min(nums[i],curr+nums[i]);

            min=Math.min(min,curr);
        }
        return min;
    }
    
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(minSubarray(nums));
}
}
