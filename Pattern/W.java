import java.util.*;
public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        for(int r=1; r<=n;r++){
            for(int c=1;c<=n;c++){
                if(c==1 || c==n){
                    System.out.print("*"+"\t");
                }

                else if((r+c)==(n+1) && r>n/2){
                    System.out.print("*"+"\t");
                }
                
                else if(r==c && r>n/2){
                    System.out.print("*"+"\t");
                }

                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
