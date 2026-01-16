// Given an array nums of n integers where nums[i] is in the range [1, n], 
// return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.List;

public class numsDissappearedinArr {
     public List<Integer> findDisappearedNumbers(int[] arr) {
       List<Integer>ans = new ArrayList<>();
        int n = arr.length;  //1 to n.
        int i=0;
        while(i<n){
            int rightidx = arr[i]-1;
            if(arr[i]==i+1 || arr[rightidx]==arr[i]) i++;
            else swap(arr,i,rightidx);
        }
        for(i=0; i<n; i++){
            if(arr[i] != i+1) ans.add(i+1);  // change from array duplicate.
            
        }
        return ans;
    }
    
    public void swap ( int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;  
    }
}
