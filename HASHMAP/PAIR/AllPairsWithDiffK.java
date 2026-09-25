/*


Given an array arr[] of positive integers. Find the number of pairs of integers whose absolute difference equals to a given number k.
Note: (a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered different.

The answer is guaranteed to fit in a 32-bit integer.

Examples:

Input: arr[] = [1, 4, 1, 4, 5], k = 3
Output: 4
Explanation: There are 4 pairs with absolute difference 3, the pairs are {1, 4}, {1, 4}, {4, 1} and {1, 4}.
Input: arr[] = [8, 16, 12, 16, 4, 0], k = 4
Output: 5
Explanation: There are 5 pairs with absolute difference 4, the pairs are {8, 12}, {8, 4}, {16, 12}, {12, 16}, {4, 0}.





*/







package HASHMAP.PAIR;

import java.util.HashMap;

public class AllPairsWithDiffK {
    public static int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
                int count=0;
                        for (int i = 0; i < arr.length; i++) {
                            
                            if(map.containsKey(arr[i]+k)){
                                 count=count+map.get(arr[i]+k);
                            }
                            
                            if(map.containsKey(arr[i]-k)){
                                count=count+map.get(arr[i]-k);
                            }
                            if (map.containsKey(arr[i])) {
                                map.put(arr[i],map.get(arr[i])+1);
                            }
            else{
                map.put(arr[i],1);
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
