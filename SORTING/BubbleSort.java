package SORTING;

public class BubbleSort{
    public static int[] BubbleSort(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }

    }
        return nums;
    }
    public static void main(String args[]){
        int nums[]={5,4,1,3,2};
        BubbleSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}