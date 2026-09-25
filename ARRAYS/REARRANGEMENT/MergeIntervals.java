package REARRANGEMENT;
//LEETCODE PROBLEM NUMBER 56

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeIntervals {
     public static int[][] merge(int[][] intervals) {
       /* Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        ArrayList<int[]> ans=new ArrayList<>();

        int i=0;

        while(i<intervals.length){

            int start=intervals[i][0];
            int end=intervals[i][1];

            int j=i+1;

            while(j<intervals.length && intervals[j][0]<=end){
                
                end=Math.max(end,intervals[j][1]);

                j++;
            }
            ans.add(new int[]{start,end});

            i=j;
        }
        return ans.toArray(new int[ans.size()][]);*/

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        ArrayList<int[]> ans=new ArrayList<>();

       int[] current=intervals[0];

       for(int i=1;i<intervals.length;i++){
        if(intervals[i][0]<=current[1]){
            current[1]=Math.max(current[1],intervals[i][1]);
        }
        else{
            ans.add(current);
            current=intervals[i];
        }
       }
       ans.add(current);

       return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of intervals: ");
    int n = sc.nextInt();

    int[][] intervals = new int[n][2];

    System.out.println("Enter the intervals:");

    for (int i = 0; i < n; i++) {
        intervals[i][0] = sc.nextInt(); // start
        intervals[i][1] = sc.nextInt(); // end
    }

    int[][] ans = merge(intervals);

    System.out.println("Merged Intervals:");

    for (int i = 0; i < ans.length; i++) {
        System.out.println(ans[i][0] + " " + ans[i][1]);
    }

    sc.close();
}
}
