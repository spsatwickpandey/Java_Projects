import java.util.*;
public class Zprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=n;i>0;i--){
            if(i==n || i==1){
                for(int k=0;k<n;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            else{
                for(int j=0; j<i-2;j++){
                    System.out.print(" ");
                }

                System.out.println("*");
                
            }
        }
    }
}
