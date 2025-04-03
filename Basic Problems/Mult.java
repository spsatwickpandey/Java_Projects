import java.util.*;
public class Mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        float f1 = sc.nextFloat();
        
        System.out.println("Enter value: ");
        float f2 = sc.nextFloat();
        
        float f3 = f1*f2;

        System.out.println("Result: "+f3);
        sc.close();
    }
}
