import java.util.*;
public class MatrixRotationClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int a=0;a<n;a++){
            for(int b=0;b<n/2;b++){
                int temp = mat[a][b];
                mat[a][b] = mat[a][n-b-1];
                mat[a][n-b-1] = temp;
            }
        }
        System.out.println("Transpose: "+Arrays.deepToString(mat));


    }
}
