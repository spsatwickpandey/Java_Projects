import java.util.*;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int rmin=0;
        int cmin=0;
        int rmax=n-1;
        int cmax=n-1;

        int mat[][] = new int[n][n];
        int totalEle = n*n;
        int c=1;
        while(c<=totalEle){
            for(int i=rmin,j=cmin;j<=cmax && c<=totalEle ; j++){
                mat[i][j]=c;
                c++;
            }

            for(int i=rmin+1,j=cmax;i<=rmax && c<=totalEle ; i++){
                mat[i][j]=c;
                c++;
            }

            for(int i=rmax,j=cmax-1;j>=cmin && c<=totalEle ; j--){
                mat[i][j]=c;
                c++;
            }

            for(int i=rmax-1,j=cmin;i>=rmin+1 && c<=totalEle ; i--){
                mat[i][j]=c;
                c++;
            }

            rmax--;
            cmax--;
            rmin++;
            cmin++;
        }

        System.out.println(Arrays.deepToString(mat));

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(mat[i][j]+"\t");
        //     }
        //     System.out.println();
        // }

    }
    
}
