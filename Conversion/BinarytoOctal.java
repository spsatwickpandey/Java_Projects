import java.util.*;

public class BinarytoOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Binary number: ");
        long n = sc.nextLong();

        int answer = bintoOct(n);
        System.out.println("The Octal Conversion of "+n+" is: "+answer);
    }
    public static int bintoOct(long binary){
        int octalnumber=0,decimalnumber=0,i=0;
        while(binary !=0){
            int remainder = (int)binary%10;
            decimalnumber+=remainder*(int)Math.pow(2,i);
            i+=1;
            binary=binary/10;
        }
        i=1;
        while(decimalnumber !=0){
            int remainder = decimalnumber%8;
            octalnumber+=remainder*i;
            i=i*10;
            decimalnumber=decimalnumber/8;
        }
        return octalnumber;
    }
}
