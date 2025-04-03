import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int temp=n;
        int temp1=temp;
        int d=0;

        while(temp1!=0){
            d++;
            temp1/=10;
        }

        int ans=0;

        for(int i=1;i<=d;i++){
            int rem = temp%10;
            ans+=i*(int)Math.pow(10,rem-1);
            temp/=10;
        }
        System.out.println("Inverse of the Number: "+ans);
    }
}
