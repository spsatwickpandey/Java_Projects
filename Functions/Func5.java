import java.util.*;
public class Func5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of Numbers: ");
        int b = sc.nextInt();

        System.out.println("Enter Numbers: ");
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        long num = anyBaseAddition(b,n1,n2);
        System.out.println(num);
    }

    public static long anyBaseAddition(int base, long number1, long number2){
        int carry = 0;
        int i=0;
        long addval= 0;
        while(number1!=0 || number2!=0 || carry!=0){
            int rem1 = (int)(number1%10);
            int rem2 = (int)(number2%10);
            int sum = rem1+rem2+carry;

            carry = sum / base;
            int digit = sum % base;

            addval += digit*Math.pow(10,i);
            
            number1/=10;
            number2/=10;
            i++;
        }
        return addval;
    }
}
