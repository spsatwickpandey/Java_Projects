import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Rectangle: ");
        double l = sc.nextDouble();

        System.out.println("Enter Bredth of Rectangle: ");
        double b = sc.nextDouble();

        double p = 2*(l+b);

        System.out.println("Perimeter: "+p);
    }
}
