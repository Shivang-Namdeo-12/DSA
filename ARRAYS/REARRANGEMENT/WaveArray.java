package REARRANGEMENT;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void waveArray(int[] nums){
       /*  Arrays.sort(nums);

        for(int i=0;i<nums.length;i+=2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;*/



            for(int i=0;i<nums.length-1;i+=2){
                if(nums[i]<nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of an array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        waveArray(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
