import java.util.*;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int n = sc.nextInt();

        int octal = decTooct(n);
        System.out.println("The Octal value of "+n+" is: "+octal);
    }
    public static int decTooct(int decimal){
        int octalnumber=0,i=0;
        while(decimal!=0){
            int remainder = decimal %8;
            octalnumber+= remainder*Math.pow(10,i);
            i+=1;
            decimal=decimal/8;
        }
        return octalnumber;
    }
}
