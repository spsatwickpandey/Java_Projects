import java.util.*;
//factorial.
public class Reverse {

    // public static void rev(int l,int r,int[] arr){
    //     if(l>=r){
    //         System.out.println(Arrays.toString(arr));
    //         return;
    //     }

    //     //swap
    //     arr[l]=arr[l]+arr[r];
    //     arr[r]=arr[l]-arr[r];
    //     arr[l]=arr[l]-arr[r];

    //     rev(l+1,r-1,arr);
    // }

        
    public static void rev(int i,int n,int[] arr){
        if(i>=n/2){
            System.out.println(Arrays.toString(arr));
            return;
        }

        //swap
        arr[i]=arr[i]+arr[n-i-1];
        arr[n-i-1]=arr[i]-arr[n-i-1];
        arr[i]=arr[i]-arr[n-i-1];

        rev(i+1,n,arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: "); //only enter +ve natural numbers
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // rev(0,n-1,arr);
        rev(0,n,arr);
    }
}
