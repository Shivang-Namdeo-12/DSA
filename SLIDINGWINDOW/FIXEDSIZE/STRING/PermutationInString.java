/*
LEETCODE PROBLEM NUMBER 567

Title:
Permutation in String

Pattern:
Sliding Window

Sub-pattern:
String -> Fixed Size Window

Problem:
Given two strings s1 and s2, return true if s2 contains
a permutation of s1.

Example 1:
Input:
s1 = "ab"
s2 = "eidbaooo"

Output:
true

Example 2:
Input:
s1 = "ab"
s2 = "eidboaoo"

Output:
false
*/

package SLIDINGWINDOW.FIXEDSIZE.STRING;
import java.util.Arrays;
public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int s1freq[]=new int[26];
        int windfroq[]=new int[26];

        if (s1.length()>s2.length()) {
            return false;
        }

        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            windfroq[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1freq,windfroq)){
            return true;
        }
        for(int i=s1.length();i<s2.length();i++){
            windfroq[s2.charAt(i)-'a']++;
            windfroq[s2.charAt(i-s1.length())-'a']--;

            if(Arrays.equals(windfroq,s1freq)){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = checkInclusion(s1, s2);

        System.out.println(ans);
    }
}