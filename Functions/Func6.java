import java.util.*;
public class Func6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base of Numbers: ");
        int b = sc.nextInt();

        System.out.println("Enter Numbers: ");
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        long sub = anyBaseSubtract(b, n1, n2);
        System.out.println("Result: "+sub);
    }

    public static long anyBaseSubtract(int base,long number1,long number2){
        int borrow = 0;
        int i=0;
        long subval= 0;
        while(number1>0){
            int rem1 = (int)(number1%10);
            int rem2 = (int)(number2%10);
            int diff = rem1-rem2-borrow;

            if(diff<0){
                diff+=base;
                borrow=1;
            }
            else{
                borrow=0;
            }

            subval += diff*Math.pow(10,i);
            
            number1/=10;
            number2/=10;
            i++;
        }
        return subval;
    }
}
