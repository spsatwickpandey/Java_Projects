import java.util.*;
public class MirrorUStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int z=0;z<n;z++){
            for(int x=0;x<z;x++){
                System.out.print(" ");
            }
            for(int y=n-z;y>0;y--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
