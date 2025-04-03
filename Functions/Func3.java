import java.util.*;
public class Func3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int n = sc.nextInt();

        System.out.println("Enter Base in which you want to convert: ");
        int b = sc.nextInt();
        
        long num = decimaltoanyBase(n,b);
        System.out.println("The Number of base "+b+" is: "+num);
    }

    public static long decimaltoanyBase(int decimalnumber,int base){
        long number = 0;
        int count = 0;
        int temp = decimalnumber;
        
        while(temp!=0){
            int remainder = temp % base;
            number += remainder*Math.pow(10,count);
            temp/=base;
            count++; 
        }
        return number;
    }
}
