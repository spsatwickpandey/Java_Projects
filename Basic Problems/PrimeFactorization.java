import java.util.*; 
public class PrimeFactorization {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of Prime Factors: "+count);
    }
}
