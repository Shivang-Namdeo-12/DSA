package REARRANGEMENT;

import java.util.Scanner;

//LEETCODE PROBLEM NUMBER 121
public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
       int max=0;
       int buy=prices[0];

       for(int i=1;i<prices.length;i++){
        if(buy<prices[i]){
            int profit=prices[i]-buy;

            max=Math.max(max,profit);
        }
        else{
            buy=prices[i];
        }
       }
       return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of: ");
        int n=sc.nextInt();

        int prices[]=new int[n];

        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        maxProfit(prices);
        System.out.println(maxProfit(prices));
    }
}
