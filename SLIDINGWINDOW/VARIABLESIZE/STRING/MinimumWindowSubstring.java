/*
LEETCODE PROBLEM NUMBER 76

Title:

Minimum Window Substring

Pattern:

Sliding Window

Sub-pattern:

String -> Variable Size Window

Problem:

Given two strings s and t, return the minimum window substring
of s such that every character in t, including duplicates,
is included in the window.

If there is no such substring, return an empty string "".

Example 1:

Input:

s = "ADOBECODEBANC"
t = "ABC"

Output:

"BANC"

Example 2:

Input:

s = "a"
t = "a"

Output:

"a"

Example 3:

Input:

s = "a"
t = "aa"

Output:

""

*/

package SLIDINGWINDOW.VARIABLESIZE.STRING;

import java.util.Arrays;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        int tFreq[] = new int[128];
        int windFreq[] = new int[128];

        int left = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int matched = 0;

        for (int i = 0; i < t.length(); i++) {
            tFreq[t.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {

            windFreq[s.charAt(i)]++;

            if (windFreq[s.charAt(i)] <= tFreq[s.charAt(i)]) {
                matched++;
            }

            while (matched == t.length()) {

                if (i - left + 1 < min) {
                    min = i - left + 1;
                    start = left;
                }

                windFreq[s.charAt(left)]--;

                if (windFreq[s.charAt(left)] < tFreq[s.charAt(left)]) {
                    matched--;
                }

                left++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + min);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String ans = minWindow(s, t);

        System.out.println(ans);
    }
}