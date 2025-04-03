import java.util.*;
public class LCM {
    public static void main(String[] args) {
        int n1,n2,lcm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number:");
        n1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        n2 = sc.nextInt();

        if(n1>n2){
            lcm = n1;
        }
        else{
            lcm = n2;
        }

        while(true){
            if(lcm % n1 == 0 && lcm % n2 == 0){
                break;
            }
            lcm++;
        }
   
        System.out.println("LCM = "+lcm);
        sc.close();
    }
}
