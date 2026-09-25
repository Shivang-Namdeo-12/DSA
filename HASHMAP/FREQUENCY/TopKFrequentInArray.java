/*


Given a non-empty integer array arr[]. Your task is to find and return the top k elements which have the highest frequency in the array.

Note: If two numbers have the same frequency, the larger number should be given the higher priority.

Examples:

Input: arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2
Output: [4, 1]
Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency and 4 is larger than 1.
Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4
Output: [5, 11, 7, 10]
Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, frequency of 10 is 1.



*/










package HASHMAP.FREQUENCY;

import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentInArray {
     public static ArrayList<Integer> topKFreq(int[] nums, int k) {
        // Code here
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
                              
                              while(ans.size()<k){
                                  int maxFreq=-1;
                                  int best=Integer.MIN_VALUE;
                                  
                                  for(int key: map.keySet()){
                                      if(map.get(key)>maxFreq){
                                          maxFreq=map.get(key);
                                          best=key;
                                      }
                                      else if(map.get(key)==maxFreq && key>best){
                                          best=key;
                                      }
                                  }
                                  ans.add(best);
                                  
                                  map.remove(best);
                              }
                              return ans;
        
    }
        public static void main(String[] args){
        int nums[]={7,10,11,5,2,5,5,7,11,8,9};
        int k=4;
        System.out.println(topKFreq(nums,k));
    }

}
