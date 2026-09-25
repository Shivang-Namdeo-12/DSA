package REARRANGEMENT;
// GFG PROBLEM

import java.util.Arrays;
import java.util.Scanner;
public class ChocolateDistributionProblem {
    public static int minDifference(int nums[],int m){
        Arrays.sort(nums);

        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length-m;i++){
            int diff=nums[i+m-1]-nums[i];

            min=Math.min(min,diff);
        }
        return min;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int m=sc.nextInt();

        minDifference(nums,m);
        
        System.out.println(minDifference(nums, m));
    }
}
