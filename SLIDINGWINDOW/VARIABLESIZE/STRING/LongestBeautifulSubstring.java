/*
LEETCODE PROBLEM NUMBER 1839

Title:

Longest Substring of All Vowels in Order

Pattern:

Sliding Window

Sub-pattern:

String -> Variable Size Window

Problem:

A substring is beautiful if:

1. It contains only the vowels 'a', 'e', 'i', 'o', 'u'.
2. All five vowels appear at least once.
3. The vowels are in non-decreasing order.

Return the length of the longest beautiful substring.

Example 1:

Input:

word = "aeiouu"

Output:

6

Explanation:

"aeiouu" is a beautiful substring.

Example 2:

Input:

word = "aeeeiiiioooauuuaeiou"

Output:

5

Explanation:

The longest beautiful substring is "aeiou".

Example 3:

Input:

word = "a"

Output:

0

Explanation:

All five vowels are not present.
*/


package SLIDINGWINDOW.VARIABLESIZE.STRING;

public class LongestBeautifulSubstring {

    public static int longestBeautifulSubstring(String word) {
        int left=0;
        int max=0;
        int count=0;
        
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)<word.charAt(i-1)){
                left=i;
                count=1;
            }
            else if(word.charAt(i)>=word.charAt(i-1)){
                count++;
            }
            if(count==5){
                max=Math.max(max,i-left+1);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        String word = "aeiouu";

        int ans = longestBeautifulSubstring(word);

        System.out.println(ans);
    }
}