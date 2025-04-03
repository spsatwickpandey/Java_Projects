import java.util.*;
public class SubSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        String arr[] = new String[n];
        System.out.println("Enter Elements: ");

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            
        }
        subset(arr);

    }

    public static void subset(String[] arr){
        int total = (int)Math.pow(2,arr.length);
        for(int i=0;i<total;i++){
            int b = getBinary(i);
            mapBinaryToElments(arr, b);
        } 
    }
    
    public static int getBinary(int n){
        int count=0;
        int ans=0;
        while(n!=0){
            int rem = n%2;
            ans += rem*(int)Math.pow(10,count);
            n/=2;
            count++;
        }
        return ans;
    }

    public static void mapBinaryToElments(String[] arr,int b){
        int n = arr.length;
        int count = 0;

        System.out.print("{ ");
        while(b!=0 || count<n){
            int rem = b%10;
            if(rem==0){
                System.out.print("_");
            }
            else{
                System.out.print(arr[count]);
            }

            if(count!=n-1) System.err.print(", ");
            b/=10;
            count++;
        }
        System.out.println(" }");
    }
}
