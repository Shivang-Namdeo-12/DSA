/*


You are given an array arr[] and an integer target. You have to count all pairs in the array such that their sum is equal to the given target.

Examples:

Input: arr[] = [1, 5, 7, -1, 5], target = 6 
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
Input: arr[] = [1, 1, 1, 1], target = 2 
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0
Explanation: There is no pair with sum = target

*/

package HASHMAP.PAIR;

import java.util.HashMap;

public class CountPairWithSum {
    public static int countPairs(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                count = count + map.get(comp);
            }

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1 };
        int target = 2;
        System.out.println(countPairs(nums, target ));
    }
}
