import java.util.*;
public class Func1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Enter target digit: ");
        int d = sc.nextInt();

        int f = getFrequency(n,d);
        System.out.println("Number of times "+d+" occurred in "+n+" is: "+f);
    }

    public static int getFrequency(int number, int digit){
        int temp = number;
        int count = 0;

        while(temp!=0){
            int r = temp%10;
            if(r==digit){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}
