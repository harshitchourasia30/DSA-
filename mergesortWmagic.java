public class mergesortWmagic {

    public static void main(String[] args){
        int [] arr = {5,2,8,4,1,6,7,3,-5};
        mergesort(arr);
        for(int ele : arr) System.out.print(ele +" "); 
    }

    private static void mergesort(int [] arr){
        int n = arr.length;
        if(n==1) return; // base case. 1 length array is already sorted.

        //Step 1 :- create 2 new empty arrays of size n/2.
        
        int[] a= new int [n/2];
        int[] b =new int[n - n/2];

        //Step 2 :- copy paste arr into a and b.

        int idx = 0 ;  //idx travel in arr.
        for(int i=0; i<a.length; i++) a[i]=arr[idx++];
        for(int i=0; i<b.length; i++) b[i]=arr[idx++];

        //step 3 :- magic;

        mergesort(a);
        mergesort(b);

        //Step 4 :- merge these 2 arrays in original array.
        merge(a,b,arr);
    }
      
    //merging two sorted arrays 

    public static void merge(int[]a ,int[] b ,int[] c ){
        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length)c[k++]=a[i++];
        while(j<b.length)c[k++]=b[j++];

    }
    
}