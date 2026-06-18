import java.util.*;
//Print 1-n number of times.
public class Problem2 {

    public static void f1(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        f1(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Times: ");
        int n = sc.nextInt();

        f1(1,n);
        sc.close();
    }
}
