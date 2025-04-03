import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean isprime;

        System.out.println("Enter Lower Range Number:");
        int n1 = sc.nextInt();

        System.out.println("Enter Higher Range Number");
        int n2 = sc.nextInt();

        for(int i = n1; i<=n2; i++){
            isprime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime==true){
                System.out.println(i);
            }
        }
        sc.close();




    }
}
