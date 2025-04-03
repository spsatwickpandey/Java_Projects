import java.util.*;
public class invertedRightTriangle {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.println("Enter number of Rows: ");
    //     int n = sc.nextInt();

    //     int spc=0,stc=n;

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<spc;j++){
    //             System.out.print("\t");
    //         }
    //         for(int k=0;k<stc;k++){
    //             System.out.print("*\t");
    //         }
    //         System.out.println();
    //         spc++;
    //         stc--;
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r<=c){
                    System.out.print("*");
                }
                else if(r>c){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
