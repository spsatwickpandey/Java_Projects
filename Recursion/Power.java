import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base: ");
        double x = sc.nextDouble();

        System.out.println("Enter Power: ");
        int n = sc.nextInt();

        long N = n;  // Use long to handle Integer.MIN_VALUE case
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = power(x,N);
        System.out.println("Answer: "+ans);

        System.out.println("Steps: "+count);
    }

    // public static int power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }

    //     return x*power(x,n-1);
    // }

    static int count =0;

    public static double power(double x,long n){    //Optimized 
        count++;
        if(n==0){
            return 1;
        }
        double res = power(x,n/2);
        if(n%2==0){
            return res*res;
        }
        else{
            return x*res*res;
        }
    }
}
