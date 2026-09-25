package REARRANGEMENT;
//LEETCODE PROBLEM NUMBER 2149
import java.util.Scanner;
public class RearrangeElementBySign {
    public static int[] rearrangeArray(int[] nums) {
     /*   int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int ans[]=new int[nums.length];
        int p=0;
        int n=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }
            else{
                neg[n]=nums[i];
                n++;
            }
        }
     /*  int a=0;
       int b=0;
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            ans[i]=pos[a];
            a++;
        }
        else{
            ans[i]=neg[b];
            b++;
        }
       }

       int a=0;
       for(int i=0;i<pos.length;i++){
       ans[a]=pos[i];
       ans[a+1]=neg[i];
       a+=2;
       } 
        return ans;*/

        int ans[]=new int[nums.length];

        int pos=0;
        int neg=1;

        for(int num:nums){
            if(num>0){
            ans[pos]=num;
            pos+=2;
        }
        else{
            ans[neg]=num;
            neg+=2;
        }
    }
    return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of an array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int ans[]=rearrangeArray(nums);

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
