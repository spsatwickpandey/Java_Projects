import java.util.*;
public class Factorial {
   public static void main(String[] args) {
    int fact=1;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number: ");
    int n = sc.nextInt();

    if(n==0){
        System.out.println("Factorial: "+fact);
    }

    else{
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);    
    }
   }
}
