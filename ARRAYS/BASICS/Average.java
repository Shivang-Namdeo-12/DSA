package BASICS;
import java.util.Arrays;
public class Average {
    public static void main(String[] args) {
       /*  int nums[]={0,1,0,3,12};
       int i=0;
       for(int j=0;j<nums.length;j++){
       if(nums[j]!=0){
        nums[i]=nums[j];
        i++;
       }
    }
       while(i<nums.length){
        nums[i]=0;
        i++;
       }
    
    System.out.println(Arrays.toString(nums));

    */

    int nums[]={1,0};
    int ans[]=new int[2];

    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            ans[i]=0;
        }
        else{
            ans[i]=1;
        }
    }
    System.out.println(Arrays.toString(ans));
}
}
