 /*
 
 LEETCODE PROBLEM NUMBER 424
 
 Title:
 
 Longest Repeating Character Replacement
 
 Pattern:
 
 Sliding Window
 
 Sub-pattern:
 
 String -> Variable Size Window
 
 Problem:
 
 You are given a string s containing only uppercase English letters
 and an integer k.
 
 You can change at most k characters in the string.
 
 Find the length of the longest substring that can be changed
 so that all characters in the substring are the same.
 
 Example 1:
 
 Input:
 
 s = "ABAB"
 k = 2
 
 Output:
 
 4
 
 
 Example 2:
 
 Input:
 
 s = "AABABBA"
 k = 1
 
 Output:
 
 4
 
 */

package SLIDINGWINDOW.VARIABLESIZE.STRING;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        /* HashMap<Character , Integer > map=new HashMap<>();
        int left=0;
        int max=0;
        int ans=0;

        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           max=Math.max(max,map.get(s.charAt(i)));

           while(((i-left+1)-max)>k){
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            left++;
           }
           ans=Math.max(ans,i-left+1);

        }
        return ans;
        */

         int freq[]=new int[26];
        int left=0;
        int max=0;
        int ans=0;

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;

            max=Math.max(max,freq[s.charAt(i)-'A']);

            while((i-left+1)-max>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(max,i-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int ans = characterReplacement(s, k);

        System.out.println(ans);
    }
}