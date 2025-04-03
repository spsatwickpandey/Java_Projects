import java.util.Scanner;

public class FILI {

    
    public static int firstIndex(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==k){
                if(mid==0 || arr[mid-1]!=k){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
            else if(arr[mid]>k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;

    }

    public static int lastIndex(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==k){
                if(mid==arr.length-1 || arr[mid+1]!=k){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }
            else if(arr[mid]>k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of values in Array: ");    
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be searched: ");
        int x = sc.nextInt();
        int fi = firstIndex(ar,x);
        System.out.println(fi);
        int li = lastIndex(ar,x);
        System.out.println(li);
    }
}
