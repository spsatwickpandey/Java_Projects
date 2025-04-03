import java.util.*;
public class NumberPlay {
    public static void main(String[] args) {
        int count=0,rev=0;

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Number: ");
         int n = sc.nextInt();

         int temp1=n;
         int temp2=temp1;

        //  while(temp!=0){
        //     int r = temp%10;
        //     rev=rev*10+r;
        //     temp/=10;
        //     count++;
        //  }
        //  System.out.println("Number of digits = "+count);
        //  System.out.println("Reverse: "+rev);

        //For printing left to right:

        while(temp1!=0){
            temp1/=10;
            count++;
        }
        
        while(count!=0){
            int d = count-1;
            int rem = temp2/(int)Math.pow(10,d);
            System.out.println(rem);
            temp2%=Math.pow(10,d);
            count--;
        }



        
        //Print left to right without using pow function:


        // int d=0,i=0,pow=1;

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number: ");
        // int n = sc.nextInt();

        // int temp1=n;

        // while(temp1!=0){
        //     temp1/=10;
        //     d++;
        // }

        // while(i<(d-1)){
        //     pow*=10;
        //     i++;
        // }
        
        // while(d!=0){
        //     int rem = n/pow;
        //     System.out.println(rem);
        //     n%=pow;
        //     pow/=10;
        //     d--;
        // }
    }
}
