import java.util.*;
public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Disks: ");
        int n = sc.nextInt();

        System.out.println("Enter Source: ");
        int src = sc.nextInt();

        System.out.println("Enter Destination: ");
        int dest = sc.nextInt();

        System.out.println("Enter helper: ");
        int helper = sc.nextInt();

        toh(src,dest,helper,n);

    }

    public static void toh(int src,int dest,int helper, int n){
        if(n==0){
            return;
        }
        toh(src,helper,dest,n-1);
        System.out.println(n+"["+src+" -> "+dest+"]");
        toh(helper,dest,src,n-1);
    }
}
