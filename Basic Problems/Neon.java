import java.util.*;
import java.math.*;
public class Neon {
    public static void main(String[] args) {
        int rem,check=0;
        double sq;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        sq = Math.pow(n,2);
        int temp = (int) sq;
        

        while(temp>0){
            rem=temp%10;
            check+=rem;
            temp/=10;
        }

        if(check ==(int) n){
            System.out.println("Neon Number");
        }

        else{
            System.out.println("Not a Neon Number");
        }

    }
}
