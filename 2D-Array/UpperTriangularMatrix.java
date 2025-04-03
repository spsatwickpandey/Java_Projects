import java.util.*;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int gap=0;
        for(int a=gap;a<n;a++){
            int c=a;
            for(int b=0;b<n-gap;b++){
                System.out.println(mat[b][c++]);
            }
            gap++;
        }
    }
}
