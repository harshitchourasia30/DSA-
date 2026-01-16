// Given an array arr[] of size n, containing elements from the range 1 to n, 
// and each element appears at most twice, return an array of all the integers that appears twice.

// Note: You can return the elements in any order but the driver code will print them in sorted order.

import java.util.ArrayList;

public class arrayduplicate {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer>ans = new ArrayList<>();
        int n = arr.length;  //1 to n.
        int i=0;
        while(i<n){
            int rightidx = arr[i]-1;
            if(arr[i]==i+1 || arr[rightidx]==arr[i]) i++;
            else swap(arr,i,rightidx);
        }
        for(i=0; i<n; i++){
            if(arr[i] != i+1) ans.add(arr[i]);
            
        }
        return ans;
    }
    
    public void swap ( int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
