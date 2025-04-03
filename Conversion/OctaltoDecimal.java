import java.util.*;

public class OctaltoDecimal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter an Octal number: ");
       int n = sc.nextInt();

       int decimal = octTodec(n);
       System.out.println("The Decimal value of "+n+" is: "+decimal);
    }
    public static int octTodec(int octal){
        int decimalnumber = 0,i=0;
        while(octal!=0){
            int remainder = octal % 10;
            decimalnumber+=remainder*Math.pow(8,i);
            i+=1;
            octal=octal/10;
        }
        return decimalnumber;
    }
}
