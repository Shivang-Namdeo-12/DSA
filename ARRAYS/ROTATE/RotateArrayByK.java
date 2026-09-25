package ROTATE;
//LEETCODE PROBLEM NUMBER 189
public class RotateArrayByK {

    public static void rotate(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++; 

            j--;
        
        }
    }
    public static int[] Rotate(int nums[],int k){
        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);

        return nums;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
       Rotate(nums,k);
       for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }
    }
}
