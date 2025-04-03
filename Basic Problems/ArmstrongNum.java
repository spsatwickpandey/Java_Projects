import java.util.*;
import java.math.*;
public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1,temp2;
        double num=0;
        int rem,count=0;

        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        temp1 = n;
        temp2 = temp1;

        while(temp1>0){
            count++;
            temp1=temp1/10;
        }

        while(temp2>0){
            rem = temp2 % 10;
            num = num + Math.pow(rem,count);
            temp2 = temp2 / 10;
        }
        System.out.println(count);
        
        int j = (int) num;
        System.out.println(j);

        if(n==num){
            System.out.println("Armstrong Number");
        }

        else{
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}

