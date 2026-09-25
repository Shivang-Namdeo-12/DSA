/*






LEETCODE PROBLEM NUMBER 633









Given an integer c, check whether there exist two integers a and b such that:

a² + b² = c
Example 1
c = 5

Because:

1² + 2² = 1 + 4 = 5

Output:

true
Example 2
c = 3

No such a and b exist.

Output:

false









*/






package TWOPOINTER.OPPOSITEDIRECTION;

public class SumOfSquareNumbers {
     public static boolean judgeSquareSum(int c) {
        int left=0;
        int right=(int)(Math.sqrt(c));

        while(left<right){
            int sum=left*left+right*right;

            if(sum==c){
                return true;
            }
            else if(sum<c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int c = 5;

        boolean result = judgeSquareSum(c);

        System.out.println(result);
    }
}
