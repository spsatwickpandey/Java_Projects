import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle Amount: ");
        float p = sc.nextFloat();

        System.out.println("Enter Rate of Interest: ");
        float r = sc.nextFloat();

        System.out.println("Enter Time to be invested for: ");
        float t = sc.nextFloat();

        float s = (p*r*t)/100;
        System.out.println("Simple Interest: "+s);

    }
}
