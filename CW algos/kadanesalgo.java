import java.util.Scanner;

public class kadanesalgo {

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
         for(int i=0; i<numbers.length; i++){
            cs=cs+numbers[i];

            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
         }
         System.out.println("our max subarray sum is :" + ms);

    }

    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
    
}


/*  Given an integer array nums, find the subarray with the largest sum, and return its sum
   
           for cases like  nums = [-1] above algo didnt work work becasue we set cs=0 ,, therefor we use this.
           
 class Solution {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);
        }
        return ms;
    }
}                                                            */
