import java.util.*;
public class RotationalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Rotation Sequence Code(1 for clockwise 0 for anticlockwise rotation): ");
        String str = sc.next();

        for(int a=0;a<str.length();a++){
            if(str.charAt(a)=='1'){
                mat=clockwise(mat,n);
            }
            else if(str.charAt(a)=='0'){
                mat=anticlockwise(mat,n);
            }
        }

        System.out.println(Arrays.deepToString(mat));
    }

    public static int[][] anticlockwise(int[][] mat,int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int a=0;a<n/2;a++){
            for(int b=0;b<n;b++){
                int temp = mat[a][b];
                mat[a][b] = mat[n-a-1][b];
                mat[n-a-1][b] = temp;
            }
        }
        return mat;
    }


    public static int[][] clockwise(int[][] mat,int n){
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

        return mat;
    }
}
