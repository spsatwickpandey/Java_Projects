import java.util.*;

public class DecimaltoHexadecimal {
    public static void main(String[] args) {
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int decimal= sc.nextInt();
        int temp = decimal;

        char hex[] = new char[100];
        while(decimal!=0){
            int rem = decimal % 16;
            if(rem<10){
                hex[j++]=(char)(rem+48);
            }
            else{
                hex[j++]=(char)(rem+55);
            }
            decimal = decimal/16;
        }

        System.out.print("The Hexadecimal Value of "+temp+" is: ");

        for(int i=j-1;i>=0;i--){
            System.out.print(hex[i]);
        }
        System.out.println();
    }
}
