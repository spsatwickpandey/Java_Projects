import java.util.*;

public class PyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int k=n-i-1;k>0;k--){
                System.out.print(" ");
            }
            for(int j=i+1;j<2*(i+1);j++){
                System.out.print(j);
            }

            for(int q=0;q<i;q++){
                System.out.print(2*i-q);
            }
 
            System.out.println();
        }
    }
}
