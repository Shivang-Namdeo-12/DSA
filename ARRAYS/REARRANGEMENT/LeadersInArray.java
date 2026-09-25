package REARRANGEMENT;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class LeadersInArray {
    public static void leaders(int nums[]) {
        /*
         * int n=nums.length;
         * for(int i=0;i<nums.length;i++){
         * boolean leader=true;
         * for(int j=i+1;j<nums.length;j++){
         * if(nums[i]<nums[j]){
         * leader=false;
         * break;
         * }
         * 
         * }
         * if(leader){
         * System.out.print(nums[i]+" ");
         * }
         * }
         */
       ArrayList<Integer>List=new ArrayList<>();
       int n=nums.length;

       int max=nums[n-1];
       List.add(max);

       for(int i=n-2;i>=0;i--){
        if(nums[i]>=max){
            max=nums[i];
            List.add(nums[i]);
        }
       }
       Collections.reverse(List);

       for(int num: List){
        System.out.print(num+" ");
       }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        leaders(nums);
    }
}
