
import java.util.*;

public class CountSumSubsequence{

    public static int subs(int i,int[] arr,int sum,int k){
        if(i==arr.length){
            if(sum==k){ 
                return 1;
            }
            return 0;
        }

        //take
        sum+=arr[i];
        int l = subs(i+1,arr,sum,k); 
        
        //not take
        sum-=arr[i];
        int r = subs(i+1,arr,sum,k);
        
        return l+r;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter Desired Sum (K): ");
        int k = sc.nextInt();

        System.out.println(subs(0,arr,0,k));

        sc.close();
    }
}
