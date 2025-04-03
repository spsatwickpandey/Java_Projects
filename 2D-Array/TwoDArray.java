import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int r = sc.nextInt();

        System.out.println("Enter Column: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter Elements: ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int a=0;a<c;a++){
            if(a%2==0){
                for(int b=0;b<r;b++){
                    System.out.print(arr[b][a]+"\t");
                }
            }
            else{
                for(int d=r-1;d>=0;d--){
                    System.out.print(arr[d][a]+"\t");
                }
            }
            System.out.println();
        }
    }
}
