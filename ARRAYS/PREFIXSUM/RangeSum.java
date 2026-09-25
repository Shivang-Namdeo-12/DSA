/*






LEETCODE PROBLEM NUMBER 370





You are given an integer length and an array updates.

Initially, we have an array of size length containing all zeros.

For every update:

[startIndex, endIndex, increment]

you need to add increment to every element from startIndex to endIndex, including both.

After applying all updates, return the final array.

🧠 Example

Input:

length = 5

updates = [
    [1, 3, 2],
    [2, 4, 3],
    [0, 2, -2]
]

Initially:

[0, 0, 0, 0, 0]
Update 1
[1, 3, 2]

Means:

index 1 → +2
index 2 → +2
index 3 → +2

Array:

[0, 2, 2, 2, 0]
Update 2
[2, 4, 3]

Means:

index 2 → +3
index 3 → +3
index 4 → +3

Array:

[0, 2, 5, 5, 3]
Update 3
[0, 2, -2]

Means:

index 0 → -2
index 1 → -2
index 2 → -2

Final:

[-2, 0, 3, 5, 3]
✅ Output
[-2, 0, 3, 5, 3]









*/






package PREFIXSUM;

public class RangeSum {
      public static int[] getModifiedArray(int length, int[][] updates) {
       int diff[]=new int[5];
       
       for(int i=0;i<updates.length;i++){
        int start=updates[i][0];
        int end=updates[i][1];
        int value=updates[i][2];

        diff[start]+=value;

        if(end+1<length){
            diff[end+1]-=value;
        }
       }
       int sum=0;
       for(int i=0;i<length;i++){
        sum+=diff[i];
        diff[i]=sum;
       }
       return diff;
    }

    public static void main(String[] args) {

        int length = 5;

        int[][] updates = {
            {1, 3, 2},
            {2, 4, 3},
            {0, 2, -2}
        };

        int[] ans = getModifiedArray(length, updates);

        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
