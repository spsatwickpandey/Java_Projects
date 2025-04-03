import java.util.*;
public class DiamondStar{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Number of Rows: ");
//         int n = sc.nextInt();

//         for(int i=1; i<n+1;i++){
//             for(int j=n-i;j>0;j--){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int x=n;x>0;x--){
//             for(int y=0;y<n-x;y++){
//                 System.out.print(" ");
//             }
//             for(int z=2*x-1;z>0;z--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }




    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter number of rows: "); //constraint n should be odd
    //     int n = sc.nextInt();

    //     int spc=n/2;
    //     int stc=1;

    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=spc;j++){
    //             System.out.print("\t");
    //         }
    //         for(int k=1;k<=stc;k++){
    //             System.out.print("*\t");
    //         }
    //         System.out.println();
    //         if(i<=n/2){
    //             spc--;
    //             stc+=2;
    //         }
    //         else if(i>n/2){
    //             spc++;
    //             stc-=2;
    //         }
    //     }
    // }


    //Line Equation Method:-

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if((r+c)<(n+3)/2){
                    System.out.print("\t");
                }
                else if((r+c)>(3*n+1)/2){
                    System.out.print("\t");
                }
                else if((r-c)>(n-1)/2){
                    System.out.print("\t");
                }
                else if((c-r)>(n-1)/2){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

}