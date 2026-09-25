package ROTATE;

public class RotateRightByOne {
    public static int[] Rotate(int nums[]){
        int last=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
               }
        nums[0]=last;

        return nums;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
       Rotate(nums);
       for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }
    }
}
