/*


Given an array arr[] and an integer k. Every element in the array appears a number of times that is a multiple of k, except for one element whose frequency is not a multiple of k. Find and return that unique element.

Examples:

Input: arr[] = [6, 2, 5, 2, 2, 6, 6], k = 3
Output: 5
Explanation: Every element appears 3 times except 5.
Input: arr[] = [2, 2, 2, 10, 2], k = 4
Output: 10
Explanation: Every element appears 4 times except 10.



*/





package HASHMAP.FREQUENCY;

import java.util.HashMap;

public class Unique {
    public static int unique(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)%k!=0){
                return key;
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
        int nums[]={2,2,2,10,2};
        int k=4;
        System.out.println(unique(nums,k));
    }
}
