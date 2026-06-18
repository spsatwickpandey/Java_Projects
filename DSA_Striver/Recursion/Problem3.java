import java.util.*;
//Print n-1 number of times.
public class Problem3 {

    public static void f1(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        f1(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Times: ");
        int n = sc.nextInt();

        f1(n,n);
        sc.close();
    }
}
