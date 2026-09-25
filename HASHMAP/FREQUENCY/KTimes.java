package HASHMAP.FREQUENCY;

import java.util.ArrayList;
import java.util.HashMap;

public class KTimes {
     public static ArrayList<Integer> countElements(int[] arr, int K,int N) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        

        for(int key:map.keySet()){
            if(map.get(key)>N/K){
                ans.add(key);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int nums[]={3,1,2,2,1,2,3,3};
        int K=4;
        int N=8;
        System.out.println(countElements(nums,K,NP));
    }

}
