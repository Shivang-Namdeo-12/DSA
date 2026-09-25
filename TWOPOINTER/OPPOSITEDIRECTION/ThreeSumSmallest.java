/*






LEETCODE PROBLEM NUMBER 259 









Given an integer array nums and an integer target, return the number of index triplets (i, j, k) such that:

i < j < k

and

nums[i] + nums[j] + nums[k] < target
Important points
Ek triplet mein 3 different indices hone chahiye.
i < j < k hona zaroori hai.
Humein actual triplets return nahi karne hain.
Sirf total count return karna hai.
Array sorted nahi diya gaya, so pehle sort karna useful hai.
Example
nums = [-2, 0, 1, 3]
target = 2

Valid triplets:

[-2, 0, 1] = -1 < 2
[-2, 0, 3] = 1  < 2
[-2, 1, 3] = 2  ❌
[0, 1, 3]  = 4  ❌

So answer:

2



*/










package TWOPOINTER.OPPOSITEDIRECTION;
import java.util.Arrays;
public class ThreeSumSmallest {
      public static int threeSumSmaller(int[] nums, int target) {
Arrays.sort(nums);
     
      int count=0;
      
      for(int i=0;i<nums.length;i++){
        int left=i+1;
      int right=nums.length-1;
        while (left<right) {
            int sum=nums[left]+nums[i]+nums[right];

            if(sum<target){
                count+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        
      }
      return count;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 0, 1, 3};
        int target = 2;

        int result = threeSumSmaller(nums, target);

        System.out.println(result);
    }
}
