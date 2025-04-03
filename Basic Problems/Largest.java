import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value: ");
        int x = sc.nextInt();
        System.out.println("Enter Value: ");
        int y = sc.nextInt();
        System.out.println("Enter Value: ");
        int z = sc.nextInt();

        if (x>y && x>z){
            System.out.println(x+" is Largest");
        }

        else if(y>x && y>z){
            System.out.println(y+" is Largest");
        }
        else{
            System.out.println(z+" is Largest");
        }
        sc.close();
    }
}
