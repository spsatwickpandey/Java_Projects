import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Variable: ");
        int x = sc.nextInt();

        System.out.println("Enter Second Variable: ");
        int y = sc.nextInt();

        y=x+y;
        x=y-x;
        y=y-x;

        System.out.println("Value of First Variable: "+x);
        System.out.println("Value of Second Variable: "+y);
        sc.close();
    }
}
