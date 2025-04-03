import java.util.*;
public class Func4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        long n = sc.nextLong();

        System.out.println("Enter Base of the number: ");
        int b1 = sc.nextInt();

        System.out.println("Enter Base in which you want to convert: ");
        int b2 = sc.nextInt();

        long num = anyBasetoanyBase(n,b1,b2);
        System.out.println("The Number after conversion to base "+b2+" is: "+num);
    }

    //Convert Number to Decimal
    public static int anyNumbertoDecimal(long number,int base){
        int decimalnumber = 0,i=0;
        while(number!=0){
            int remainder = (int)(number % 10);
            decimalnumber+=remainder*Math.pow(base,i);
            i++;
            number/=10;
        }
        return decimalnumber;
    }

    //Convert from Decimal to that Base
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

    public static long anyBasetoanyBase(long number,int base1, int base2){
        int decimalnumber = anyNumbertoDecimal(number,base1);   //anybase to decimal
        long convertedValue = decimaltoanyBase(decimalnumber,base2);  // decimal to anybase
        return convertedValue;
    }
}
