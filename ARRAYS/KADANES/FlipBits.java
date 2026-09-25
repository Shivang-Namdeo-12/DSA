package KADANES;

public class FlipBits {
    public static int flipBits(int nums[]){

        int ones=0;
        int max=Integer.MIN_VALUE;
        int curr=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int value;
            if(nums[i]==0){
                value=1;
            }
           
            else{
                value=-1;
                ones++;
            }

            if(curr==Integer.MIN_VALUE){
                curr=value;
            }else{
                curr=Math.max(value,curr+value);
            }
          

            max=Math.max(max,curr);

        }
        return max+ones;
    }

    public static void main(String[] args){

    int[] nums = {1,0,0,1,0};

    System.out.println(flipBits(nums));
}

}