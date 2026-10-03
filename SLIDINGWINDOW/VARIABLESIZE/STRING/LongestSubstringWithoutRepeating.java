/*
LEETCODE PROBLEM NUMBER 3

Title:
Longest Substring Without Repeating Characters

Pattern:
Sliding Window

Sub-pattern:
String -> Variable Size Window

Problem:
Given a string s, find the length of the longest substring
without repeating characters.

Example 1:
Input:
s = "abcabcbb"

Output:
3

Example 2:
Input:
s = "bbbbb"

Output:
1

Example 3:
Input:
s = "pwwkew"

Output:
3
*/

package SLIDINGWINDOW.VARIABLESIZE.STRING;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating{

    public static int lengthOfLongestSubstring(String s) {
      /*   HashSet<Character> set=new HashSet<>();
        int left=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        return max;
        */


        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                left=Math.max(left,map.get(ch)+1);
                left++;
            }
            map.put(s.charAt(i),1);

            max=Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int ans = lengthOfLongestSubstring(s);

        System.out.println(ans);
    }
}