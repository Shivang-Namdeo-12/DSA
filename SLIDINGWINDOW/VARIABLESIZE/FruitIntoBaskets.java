/*
    
LEETCODE PROBLEM NUMBER 904

Fruit Into Baskets

You are visiting a row of trees represented by an integer array fruits,
where fruits[i] is the type of fruit produced by the ith tree.

You have two baskets, and each basket can hold only one type of fruit.
There is no limit on the number of fruits each basket can hold.

Starting from any tree, you must pick exactly one fruit from every tree
while moving to the right. You must stop when you reach a tree whose
fruit cannot fit into either basket.

Given the integer array fruits, return the maximum number of fruits
you can collect.

Example 1:
Input: fruits = [1,2,1]
Output: 3

Example 2:
Input: fruits = [0,1,2,2]
Output: 3

Example 3:
Input: fruits = [1,2,3,2,2]
Output: 4

*/

package SLIDINGWINDOW.VARIABLESIZE;

import java.util.HashMap;

public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {
        int i=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);


            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);


                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 3, 2, 2};

        int ans = totalFruit(fruits);

        System.out.println(ans);
    }
}