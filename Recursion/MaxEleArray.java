import java.util.*;
public class MaxEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans = maxArray(arr,0);
        System.out.println(ans);
    }
    public static int maxArray(int[] arr,int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }
        int max = maxArray(arr,idx+1);
        if(max>arr[idx]){
            return max;
        }
        else{
            return arr[idx];
        }
    }
}
