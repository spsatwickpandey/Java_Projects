import java.util.*;
//Print name n number of times.
public class Problem1 {

    public static void f1(int i,int n,String name){
        if(i>n){
            return;
        }
        System.out.println(name);
        f1(i+1,n,name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Number of Times: ");
        int n = sc.nextInt();

        f1(1,n,name);
        sc.close();
    }
}
