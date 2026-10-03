/*
LEETCODE PROBLEM NUMBER 438

Title:
Find All Anagrams in a String

Pattern:
Sliding Window

Sub-pattern:
String -> Fixed Size Window

Problem:
Given two strings s and p, return an array of all starting
indices of p's anagrams in s.

Example 1:
Input:
s = "cbaebabacd"
p = "abc"

Output:
[0,6]

Example 2:
Input:
s = "abab"
p = "ab"

Output:
[0,1,2]
*/

package SLIDINGWINDOW.FIXEDSIZE.STRING;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int pfreq[]=new int[26];
        int windfroq[]=new int[26];

        if(p.length()>s.length()){
            return ans;
        }

        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i)-'a']++;
            windfroq[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pfreq,windfroq)){
            ans.add(0);
        }

        for(int i=p.length();i<s.length();i++){
            windfroq[s.charAt(i)-'a']++;
            windfroq[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(pfreq,windfroq)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
        
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = findAnagrams(s, p);

        System.out.println(ans);
    }
}