import java.util.*;
public class HCF {
    public static void main(String[] args) {
        int n1,n2,l;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Value: ");
        n1 = sc.nextInt();

        System.out.println("Enter Second Value: ");
        n2 = sc.nextInt();

        if(n1>n2){
            l = n2;
        }
        else{
            l = n1;
        }

        for(int hcf = l/2; hcf > 1 ;hcf--){
            if(n1 % hcf == 0 && n2 % hcf == 0){
                System.out.println("HCF = "+hcf);      
                break;
            }

        }
        sc.close();

    }
    
}
