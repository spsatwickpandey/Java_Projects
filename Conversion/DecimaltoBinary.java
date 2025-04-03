import java.util.*;
public class DecimaltoBinary {
    public static void main(String[] args) {
        int i=0;
        int bin[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal Value: ");
        int n = sc.nextInt();
        int temp = n;

        while(temp!=0){
            int rem = temp%2;
            bin[i++]=rem;
            temp=temp/2;
        }
        System.out.println("Binary Value of "+n+" is: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
        System.out.println();
    }

}
