import java.util.Scanner;

public class binarysearch {
    public static int BinarySearch(int numbers[], int key){
        int start = 0 , end = numbers.length-1;
        while(start <= end){
            int mid = ((start+end)/2);

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter number of elements :");
       int n= sc.nextInt();
       int number[] = new int[n];

       System.out.println("Enter element in sorted order:");
       for(int i =0; i<n; i++){
        number[i]=sc.nextInt();
       }
       System.out.print("Enter key to search: ");
       int key = sc.nextInt();
       int result = BinarySearch(number, key);

       if (result ==-1){
        System.out.println("element not found");}
        else {
            System.out.println("element found at index: " + result);
        } 
    }

    
}
