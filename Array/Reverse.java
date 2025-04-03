import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static void reverse(int[]  arr){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            arr[low]=arr[low]+arr[high];
            arr[high]=arr[low]-arr[high];
            arr[low]=arr[low]-arr[high];

            low++;
            high--;
        }
    }
}
