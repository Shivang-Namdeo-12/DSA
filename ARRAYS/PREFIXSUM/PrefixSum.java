package PREFIXSUM;

public class PrefixSum {
    public static int[] PrefixSum(int nums[]){
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
     public static void main(String args[]){
        int nums[]={1,2,3,4};
        PrefixSum(nums);
        int prefix[]=PrefixSum(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
