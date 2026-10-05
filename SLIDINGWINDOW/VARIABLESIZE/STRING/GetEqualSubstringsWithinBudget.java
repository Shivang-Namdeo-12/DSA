/*
LEETCODE PROBLEM NUMBER 1208

Title:

Get Equal Substrings Within Budget

Pattern:

Sliding Window

Sub-pattern:

String -> Variable Size Window

Problem:

You are given two strings s and t of the same length and
an integer maxCost.

The cost of changing s[i] to t[i] is:

abs(s[i] - t[i])

Find the maximum length of a substring of s that can be
changed to the corresponding substring of t with a total
cost less than or equal to maxCost.

Example 1:

Input:

s = "abcd"
t = "bcdf"
maxCost = 3

Output:

3

Explanation:

The substring "abc" can be changed to "bcd".

The total cost is:

1 + 1 + 1 = 3

Example 2:

Input:

s = "abcd"
t = "cdef"
maxCost = 3

Output:

1

Example 3:

Input:

s = "abcd"
t = "acde"
maxCost = 0

Output:

1
*/


package SLIDINGWINDOW.VARIABLESIZE.STRING;

public class GetEqualSubstringsWithinBudget {

    public static int equalSubstring(String s, String t, int maxCost) {
        int left=0;
        int max=0;
        int totalcost=0;

        for(int i=0;i<s.length();i++){
            int cost=Math.abs(s.charAt(i)-t.charAt(i));

            totalcost+=cost;

            while(totalcost>maxCost){
                totalcost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;

        int ans = equalSubstring(s, t, maxCost);

        System.out.println(ans);
    }
}