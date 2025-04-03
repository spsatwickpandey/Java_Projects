import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();

        System.out.println("Enter Number of Rotations: ");
        int k = sc.nextInt();

        int temp = n;
        int d=0;

        while(temp!=0){
            d++;
            temp/=10;
        }

        k= k % d;  //Effective number of Rotations

        //Negative Rotation i.e. (left to right)

        if(k<0){
            k=d+k; // effective positive rotation for that negative rotation.
        }

       
        //Now, Splitting,

        int a = n / (int)Math.pow(10,k);
        int b = n % (int)Math.pow(10,k);
        
        int ans = b*(int)Math.pow(10,d-k) + a;
        System.out.println("Number After "+k+" Rotations is: "+ans);
    }
}
