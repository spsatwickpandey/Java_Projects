import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle Amount: ");
        float p = sc.nextFloat();

        System.out.println("Enter Rate of Interest: ");
        float r = sc.nextFloat();

        System.out.println("Enter Time (in years) to be invested for: ");
        float t = sc.nextFloat();

        float r1 = 1 + r/100;

        double c = p * Math.pow(r1,t);
        System.out.println("Compound Interest: "+c);

    }
}
