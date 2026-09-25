/*


Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

Note: The array consists of only positive and negative integers and not zero.

Examples:

Input: arr[] = [-1, 2, -1, 3, 2]
Output: 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 
Input: arr[] = [1, 1, 1]
Output: 0
Explanation: There is not present any non-repeating element so answer should be 0.



*/










package HASHMAP.FREQUENCY;

import java.util.HashMap;

public class FirstNonRepeateatingElement {
    public static int firstNonRepeatedElementinArray(int[] nums) {
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
                     if(map.get(nums[i])==1){
                         return nums[i];
                     }
                 }
                 return 0;
    }
    public static void main(String[] args){
        int nums[]={-1,2,-1,3,2};
        System.out.println(firstNonRepeatedElementinArray(nums));
    }
}
