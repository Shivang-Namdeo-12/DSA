/*


Given an integer array arr[] of size N and a positive integer K, the task is to count all the pairs in the array with a product equal to K.

Examples:

Input: arr[] = {1, 2, 16, 4, 4, 4, 8 }, K=16
Output: 5
Explanation: Possible pairs are (1, 16), (2, 8), (4, 4), (4, 4), (4, 4)



Input: arr[] = {1, 10, 20, 10, 4, 5, 5, 2 }, K=20
Output: 5
Explanation: Possible pairs are (1, 20), (2, 10), (2, 10), (4, 5), (4, 5)







*/




package HASHMAP.PAIR;

import java.util.HashMap;

public class AllPairsWithProduct {
    public static int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
                int count=0;
                        for (int i = 0; i < arr.length; i++) {
                            if(arr[i]!=0 && k%arr[i]==0){
                            int req=k/arr[i];
                            if(map.containsKey(req)){
                                 count=count+map.get(req);
                            }
                        }
                            
                            if (map.containsKey(arr[i])) {
                                map.put(arr[i],map.get(arr[i])+1);
                            }
            else{
                map.put(arr[i],1);
            }
                        }
                        return count;
                    }
public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 2, 3};
        int k = 6;

        System.out.println(countPairs(arr, k));
    
                
    }
}
