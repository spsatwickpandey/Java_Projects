import java.util.*;
public class Func2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        long n = sc.nextLong();

        System.out.println("Enter Base of Number: ");
        int b = sc.nextInt();
 
        int decimal = anyNumbertoDecimal(n,b);
        System.out.println("The Decimal value of "+n+" is: "+decimal);
     }
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
}
