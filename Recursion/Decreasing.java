import java.util.*;

public class Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        
        decrease(n);

    }

    public static void decrease(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decrease(n-1);
    }
}
