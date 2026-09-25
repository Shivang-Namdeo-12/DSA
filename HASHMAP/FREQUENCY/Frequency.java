/*

Given an array arr[] of positive integers which may contain duplicate elements, return the frequency of each distinct element.

Examples:

Input: arr[] = [1, 2, 2, 3, 3, 5]
Output: [[1, 1], [2, 2], [3, 2], [5, 1]]
Explaiantion: Here element 1 and 5 occur 1 times, 2 and 3 occur 2 times.
Input: arr[] = [1, 5, 6, 7, 7]
Output: [[1, 1], [5, 1], [6, 1], [7, 2]]
Explanation: Here element 1, 5 and 6 occur 1 times, 7 occur 2 times.





*/

package HASHMAP.FREQUENCY;

import java.util.ArrayList;
import java.util.HashMap;

public class Frequency {

    public static ArrayList<ArrayList<Integer>> countFreq(int[] nums) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));

            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 5 };

        ArrayList<ArrayList<Integer>> result = countFreq(arr);

        System.out.println(result);
    }
}
