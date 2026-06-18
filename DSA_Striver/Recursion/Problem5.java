import java.util.*;

//Print n-1 number of times.(BackTracking)

public class Problem5 {

    public static void f1(int i,int n){
        if(i>n){
            return;
        }
        f1(i+1,n);
        System.out.println(i); //print after return
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Times: ");
        int n = sc.nextInt();

        f1(1,n);
        sc.close();
    }
}
