import java.util.*;
public class MirrorTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++){
            int val=1;
            int val2 = (r==n) ? (r-1) : r;
            for(int c=1;c<=2*n-1;c++){
                if(r>=c){
                    System.out.print(val+"\t");
                    val++;
                }
                else if((r+c)>=2*n){
                    System.out.print(val2+"\t");
                    val2--;
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
