import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        int ans = fact(n);
        System.out.println("Factorial: "+ans);
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int fact = fact(n-1);
        return n*fact;
    }
}