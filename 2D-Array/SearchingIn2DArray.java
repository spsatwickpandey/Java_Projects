import java.util.*;
public class SearchingIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int m = sc.nextInt();

        System.out.println("Enter Columns: ");
        int n = sc.nextInt();

        int mat[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Target: ");
        int t = sc.nextInt();

        int i=0;
        int j=n-1;

        while(i<n && j>=0){
            if(mat[i][j]==t){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(mat[i][j]>t){
                j--;
            }
            else if(mat[i][j]<t){
                i++;
            }
        }
        System.out.println("Not Found");


    }

}
