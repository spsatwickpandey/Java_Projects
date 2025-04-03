import java.util.*;
public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        int spc=1;  //SpaceCount
        int stc=(n+1)/2;   //StarsCount

        for(int r=1;r<=n;r++){
            for(int i=1;i<=stc;i++){
                System.out.print("*\t");
            }
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
            }
            for( int k=1;k<=stc;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(r<=n/2){
                stc--;
                spc+=2;
            }
            else if(r>n/2){
                stc++;
                spc-=2;
            }
        }
    }
}
