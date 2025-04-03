import java.util.*;

public class PrintOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range: ");
        int n = sc.nextInt();

        oddPrint(n);
    }
    public static void oddPrint(int n){
        if(n==0){
            return;
        }
        oddPrint(n-1);
        if(n%2!=0){
            System.out.println(n);
        }
    }
}
