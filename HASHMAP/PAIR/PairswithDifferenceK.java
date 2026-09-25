/*


LEETCODE PROBLEM NUMBER-532



Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.

 

Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:

Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:

Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
 




*/










package HASHMAP.PAIR;

import java.util.HashMap;

public class PairswithDifferenceK {
     public static int countPairs(int[] nums, int k) {
        // code here
       HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        if(k==0){
            for(int num:map.keySet()){
                if(map.get(num)>=2){
                    count++;
                }
            }
            return count;
        }
        for(int num:map.keySet()){
            int required=num+k;
            if(map.containsKey(required)){
                count++;
            }
        }
        return count;
            
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int k = 3;

        System.out.println(countPairs(arr, k));
    }
}
