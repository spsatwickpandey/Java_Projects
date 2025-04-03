import java.util.*;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        increase(n);
    }

    public static void increase(int n){
        if(n==0){
            return;
        }
        increase(n-1);
        System.out.println(n);
    }
}
