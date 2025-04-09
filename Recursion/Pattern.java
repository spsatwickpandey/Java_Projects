import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        pat(n);
    }

    public static void pat(int n){
        if(n==1){
            System.out.print("111");
            return;
        }
        
        for(int i=0;i<2;i++){
            System.out.print(n);
            pat(n-1);
        }
        System.out.print(n);
    }
}
