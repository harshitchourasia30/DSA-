
// Given an array of integers arr[]. You have to find the Inversion Count of the array. 
// Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].



public class inversioncount {
    static int count;  //global variable
    
    static int inversioncount(int arr[]) {
        count =0;
        mergesort(arr);
        return count;
    }
        
    
        // Code Here
        private static void mergesort(int [] arr){
        int n = arr.length;
        if(n==1) return; 

       
        
        int[] a= new int [n/2];
        int[] b =new int[n - n/2];

    

        int idx = 0 ;  
        for(int i=0; i<a.length; i++) a[i]=arr[idx++];
        for(int i=0; i<b.length; i++) b[i]=arr[idx++];

       

        mergesort(a);
        mergesort(b);

        
        merge(a,b,arr);
    }
      
    

    public static void merge(int[]a ,int[] b ,int[] c ){
        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else {  //a[i]>b[j]
            
                count += a.length-i;  //inversion count
                
                c[k++]=b[j++]; 
                
            }
        }
        
        while(i<a.length)c[k++]=a[i++];
        while(j<b.length)c[k++]=b[j++];

    }
    
}
