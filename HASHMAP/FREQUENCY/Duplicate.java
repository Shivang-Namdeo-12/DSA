/*

Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is



*/



package HASHMAP.FREQUENCY;

import java.util.ArrayList;
import java.util.HashMap;

public class Duplicate {
    public static ArrayList<Integer> duplicate(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
                   if(map.containsKey(nums[i])){
                       map.put(nums[i],map.get(nums[i])+1);
                   }
                   else{
                       map.put(nums[i],1);
                   }
               }

               for(int key:map.keySet()){
                if(map.get(key)>1){
                    ans.add(key);
                }
               }
               return ans;

    }
    public static void main(String[] args){
        int nums[]={2,3,1,2,3};
        System.out.println(duplicate(nums));
    }
}
