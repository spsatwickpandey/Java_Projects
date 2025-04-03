import java.util.*;
public class MirrorLStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int x=n;x>0;x--){
            for(int z=0;z<x-1;z++){
                System.out.print(" ");
            }
            for(int y=n-x+1;y>0;y--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
