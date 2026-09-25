/*


Given an array arr[], find the first repeating element index. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing. 

Examples:

Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.




*/










package HASHMAP.FREQUENCY;

import java.util.HashMap;

public class FirstRepeatingElement {
     public static int firstRepeatedElementinArray(int[] nums) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
               if(map.containsKey(nums[i])){
                   map.put(nums[i],map.get(nums[i])+1);
               }
               else{
                   map.put(nums[i],1);
               }

           }
           
           for(int i=0;i<nums.length;i++){
               if(map.get(nums[i])>1){
                   return i+1;
               }
           }
           return -1;
           
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4};
        System.out.println(firstRepeatedElementinArray(nums));
    }
}
