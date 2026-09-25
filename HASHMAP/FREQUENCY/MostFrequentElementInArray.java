/*


You are given an integer array arr[]. You need to return the element which occurs maximum times in arr[].
Note: If multiple such elements exists return the maximum element.

Example: 

Input: arr[] = [1, 2, 2, 2, 4, 1]
Output: 2
Explanation: 2 is most frequent element of this array with 3 occurrences.
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.
Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.




*/







package HASHMAP.FREQUENCY;

import java.util.HashMap;

public class MostFrequentElementInArray {
     public static int mostFreq(int[] nums) {
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
                        int mostfreq=0;
                        int answer=0;
                        for(int key:map.keySet()){
                            
                            if(map.get(key)>mostfreq || (map.get(key)==mostfreq && key>answer)){
                                mostfreq=map.get(key);
                                answer=key;
                            }
                        }
                        return answer;
    }
    public static void main(String[] args){
        int nums[]={3,0,0,3,8};
        System.out.println(mostFreq(nums));
    }
}
