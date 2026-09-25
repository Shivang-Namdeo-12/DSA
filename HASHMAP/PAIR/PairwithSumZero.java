/*


Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.

Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

Examples:

Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
arr[2] + arr[4] = 1 + (-1) = 0.
The distinct pair are [-1,1].
Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
Output: [[-6, 6],[-1, 1]]
Explanation: The distinct pairs are [-1, 1] and [-6, 6].


*/







package HASHMAP.PAIR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PairwithSumZero {
    public static ArrayList<ArrayList<Integer>> countPairswithZero(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        // HashMap<String, Integer> pairMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int required=0;
        for(int i=0;i<nums.length;i++){
            required=-nums[i];
             ArrayList<Integer> temp=new ArrayList<>();
            if(map.containsKey(required)){
                if(required<nums[i]){
                    temp.add(required);
                    temp.add(nums[i]);
                }
                else{
                temp.add(nums[i]);
                temp.add(required);
                }
                if(!ans.contains(temp)){
                    ans.add(temp);
                }

                /*
                
                
                  // Unique key for pair
                String pairKey = temp.get(0) + "," + temp.get(1);

                // Add only if pair is not already present
                if (!pairMap.containsKey(pairKey)) {
                    ans.add(temp);
                    pairMap.put(pairKey, 1);
                }
                    
                */
            
            }

            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
        }
         Collections.sort(ans, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            }
            return a.get(1) - b.get(1);
        });

        return ans;
    }
     public static void main(String[] args) {
        int nums[] = { -1,0,1,2,-1,-4 };
        
         ArrayList<ArrayList<Integer>> result = countPairswithZero(nums);
        System.out.println(result);
    }
}
