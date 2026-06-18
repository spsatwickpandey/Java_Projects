import java.util.*;
//sum of firt n numbers.
public class Sum {

    public static int fsum(int n){
        if(n==0){
            return 0;
        }
        return n+fsum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println(fsum(n));
    }
}
