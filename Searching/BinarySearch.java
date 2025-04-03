import java.util.*;
public class BinarySearch {

    public static int binarySearch(int low,int high,int arr[],int target){   //Using Recursion
        Arrays.sort(arr);  //array sort
        int mid = (low+high)/2;

        if(low>high){
            return -1; // not found
        }
        else if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            high = mid-1;
            return binarySearch(low,high,arr,target);
        }
        else{
            low=mid+1;
            return binarySearch(low,high,arr,target);
        }
    }


    public static int binarySearchItr(int[] arr, int target) {   //using Loop
        Arrays.sort(arr);   // array sort
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1; // not found
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number of values in Array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter Target Value: ");
        int tar = sc.nextInt();

        int result = binarySearchItr(ar,tar);
        System.out.println("Index: "+result);
    }
}
