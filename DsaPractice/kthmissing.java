// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
          int mid=(lo+hi)/2;
          int correctNo=mid+1;
          int missing =arr[mid]-correctNo;
          if(missing>=k)hi=mid-1;
          else lo=mid+1;

        }
        return hi+k+1;
   
    }
}