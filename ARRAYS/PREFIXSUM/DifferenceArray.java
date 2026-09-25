package PREFIXSUM;

public class DifferenceArray {
    public static int[] applyUpdates(int n,int[][] operations){
        int[] diff=new int[n];

        for(int[] op:operations){
            int left=op[0];
            int right=op[1];
            int value=op[2];

            diff[left]+=value;

            if(right+1<n){
                diff[right+1]-=value;
            }
        }

        for(int i=1;i<n;i++){
            diff[i]+=diff[i-1];
        }
        return diff;
    }
     public static void main(String[] args) {

        int n = 6;

        int[][] operations = {
            {1, 4, 4},
            {0, 2, 2},
            {3, 5, 3}
        };

        int[] ans = applyUpdates(n, operations);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
