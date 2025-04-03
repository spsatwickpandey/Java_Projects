import java.util.*;
public class StringtoDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.next();

        /*This method of creating object is deprecated
        Double db = new Double(str);
        System.out.println("Double Value is: "+db);*/

        double db = Double.valueOf(str);
        System.out.println("Double Value is: "+db);
    }
}
