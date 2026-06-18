import java.util.*;
//Print 1-n number of times.(BackTracking)
public class Problem4 {

    public static void f1(int i,int n){
        if(i<1){
            return;
        }
        f1(i-1,n);
        System.out.println(i); //print after return
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Times: ");
        int n = sc.nextInt();

        f1(n,n);
        sc.close();
    }
}
