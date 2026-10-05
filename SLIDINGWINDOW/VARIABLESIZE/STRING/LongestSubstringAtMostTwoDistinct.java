/*
LEETCODE PROBLEM NUMBER 159

Title:

Longest Substring with At Most Two Distinct Characters

Pattern:

Sliding Window

Sub-pattern:

String -> Variable Size Window

Problem:

Given a string s, find the length of the longest substring
that contains at most two distinct characters.

Example 1:

Input:

s = "eceba"

Output:

3

Explanation:

The longest substring is "ece",
which contains only two distinct characters: 'e' and 'c'.

Example 2:

Input:

s = "ccaabbb"

Output:

5

Explanation:

The longest substring is "aabbb",
which contains only two distinct characters: 'a' and 'b'.

Example 3:

Input:

s = "aaaa"

Output:

4

Explanation:

The whole string contains only one distinct character.
*/


package SLIDINGWINDOW.VARIABLESIZE.STRING;

import java.util.HashMap;

public class LongestSubstringAtMostTwoDistinct {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);


            while(map.size()>2){
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

        int ans = lengthOfLongestSubstringTwoDistinct(s);

        System.out.println(ans);
    }
}