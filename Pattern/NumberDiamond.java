import java.util.*;
public class NumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        int spc=n/2;
        int numc=1;
        int RowStart=1;
    

        for(int r=1;r<=n;r++){
            for(int i=1;i<=spc;i++){
                System.out.print("\t");
            }
            int val=RowStart;
            for(int c=1; c<=numc;c++){
                System.out.print(val+"\t");

                if(c<=numc/2){
                    val++;
                }

                else if(c>numc/2){
                    val--;
                }
            }
            System.out.println();

            if(r<=n/2){
                numc+=2;
                spc--;
                RowStart++;
            }

            else if(r>n/2){
                numc-=2;
                spc++;
                RowStart--;
            }
        }
    }
}
