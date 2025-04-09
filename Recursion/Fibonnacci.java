import java.util.*;
public class Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Term Index: ");
        int n = sc.nextInt();

        int ans = fibo(n);
        System.out.println("Answer: "+ans);
    }
    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        int fibonm1 = fibo(n-1);
        int fibonm2 = fibo(n-2);
        return fibonm1+fibonm2;
    }
}
