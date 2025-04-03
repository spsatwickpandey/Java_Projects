import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row of Matrix 1: ");
        int nr1 = sc.nextInt();

        System.out.println("Enter column of Matrix 1: ");
        int nc1 = sc.nextInt();

        System.out.println("Enter row of Matrix 2: ");
        int nr2 = sc.nextInt();

        System.out.println("Enter column of Matrix 2: ");
        int nc2 = sc.nextInt();

        int mat1[][] = new int[nr1][nc1];
        int mat2[][] = new int[nr2][nc2];

        System.out.println("Enter Elements of Matrix 1: ");
        for(int i=0;i<nr1;i++){
            for(int j=0;j<nc1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Elements of Matrix 2: ");
        for(int i=0;i<nr2;i++){
            for(int j=0;j<nc2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }

        int ans=0;
        if(nc1!=nr2){
            System.out.println("Cannot Multiply");
        }
        else{
            int u = nc1;
            for(int a=0;a<nr1;a++){
                for(int b=0;b<nc2;b++){
                    for(int c=0;c<u;c++){
                        ans+=mat1[a][c]*mat2[c][b];
                    }
                    System.out.print(ans+" ");
                    ans=0;
                }
                System.out.println();
            }
        }

    }
}
