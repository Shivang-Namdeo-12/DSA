/*
    
LEETCODE PROBLEM NUMBER 1089

Duplicate Zeros

Given a fixed-length integer array arr, duplicate each occurrence of zero,
shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in-place and do not return
anything.


Example 1:

Input:
arr = [1,0,2,3,0,4,5,0]

Output:
[1,0,0,2,3,0,0,4]


Example 2:

Input:
arr = [1,2,3]

Output:
[1,2,3]


Example 3:

Input:
arr = [0,0,0,0,0,0,0]

Output:
[0,0,0,0,0,0,0]


Constraints:

1 <= arr.length <= 10000
0 <= arr[i] <= 9

*/

package TWOPOINTER.SAMEDIRECTION;

import java.util.Arrays;

public class DuplicateZeroes {

    public static void duplicateZeros(int[] arr) {
        int zero=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        int j=arr.length+zero-1;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                if(j<arr.length){
                    arr[j]=arr[i];
                   
                }
                 j--;
            }
            else{
                if(j<arr.length){
                    arr[j]=0;
                    
                }
                j--;
                if(j<arr.length){
                    arr[j]=0;
                  
                }
                  j--;
            }
        }
     
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}