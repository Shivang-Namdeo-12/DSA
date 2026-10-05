/*
LEETCODE PROBLEM NUMBER 340

Title:

Longest Substring with At Most K Distinct Characters

Pattern:

Sliding Window

Sub-pattern:

String -> Variable Size Window

Problem:

Given a string s and an integer k, find the length of the
longest substring that contains at most k distinct characters.

If there is no valid substring, return 0.

Example 1:

Input:

s = "eceba"
k = 2

Output:

3

Explanation:

The longest substring is "ece",
which contains 2 distinct characters.

Example 2:

Input:

s = "aa"
k = 1

Output:

2

Explanation:

The whole string contains only one distinct character.

Example 3:

Input:

s = "aabbcc"
k = 2

Output:

4

Explanation:

The longest valid substrings are "aabb" and "bbcc".
*/


package SLIDINGWINDOW.VARIABLESIZE.STRING;

import java.util.HashMap;

public class LongestSubstringAtMostKDistinct {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int max=0;
        int left=0;

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

            while(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
            left++;
                    }
                    max=Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {

        String s = "eceba";
        int k = 2;

        int ans = lengthOfLongestSubstringKDistinct(s, k);

        System.out.println(ans);
    }
}