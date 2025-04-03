import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        boolean isprime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        for(int i=2 ; i<=Math.sqrt((double)n) ; i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            System.out.println("Prime Number");
        }

        else{
            System.out.println("Not a Prime Number");
        }
    }
}
