import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int r = sc.nextInt();

        System.out.println("Enter Column; ");
        int c = sc.nextInt();

        int mat[][] = new int[r][c];

        System.out.println("Enter Elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        int count=0;
        int rmin=0;
        int cmin=0;
        int rmax=mat.length-1;
        int cmax=mat[0].length-1;
        int totalEle  = mat.length*mat[0].length;

        while(count<totalEle){
            for(int i=rmin, j=cmin; i<=rmax && count<=totalEle;i++){
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i=rmax, j=cmin+1; j<=cmax && count<=totalEle;j++){
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i=rmax-1, j=cmax; i>=rmin && count<=totalEle;i--){
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i=rmin, j=cmax-1; j>=cmin+1 && count<=totalEle;j--){
                System.out.println(mat[i][j]);
                count++;
            }

            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }

    }
}
