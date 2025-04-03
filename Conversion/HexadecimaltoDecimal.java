import java.util.*;
public class HexadecimaltoDecimal{
    public static void main(String[] args) {
        int decimal=0,power=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Hexadecimal Value: ");
        String s = sc.next();

        int len = s.length();

        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                decimal+=(s.charAt(i)-48)*Math.pow(16,power);
                power+=1;
            }
            else if(s.charAt(i)>='A' && s.charAt(i) <= 'F'){
                decimal+=(s.charAt(i)-55)*Math.pow(16,power);
                power+=1;
            }
        }
        System.out.println("Decimal Value: "+decimal);

    }
}