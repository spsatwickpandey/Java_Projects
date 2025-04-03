import java.util.*;
public class StarArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows: ");
        int n = sc.nextInt();

        //Line Equation Method...............................................

        // for(int r=1;r<=n;r++){
        //     for(int c=1;c<=n;c++){
        //         if(r==(n+1)/2 || c==(n+1)/2 ){
        //             System.out.print("*"+"\t");
        //         }
        //         else if(c>(n+1)/2 && (r+c)<=(3*n+1)/2 && (c-r)<=n/2){
        //             System.out.print("*"+"\t");
        //         }
        //         else{
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        //Row Method.........................................................

        int rgtc = 1;

        for(int r=1;r<=n;r++){
            int spc = n/2;
            int lftc = 0;
            if(r==(n+1)/2){
                lftc=spc;
                spc=0;
            }
            for(int j=1;j<=lftc;j++){
                System.out.print("*"+"\t");
            }
            for(int i=1;i<=spc;i++){
                System.out.print("\t");
            }
            for(int c=1;c<=rgtc;c++){
                System.out.print("*"+"\t");
            }
            System.out.println();
            if(r<=n/2){
                rgtc++;
            }
            else{
                rgtc--;
            }
        }
    }
}
