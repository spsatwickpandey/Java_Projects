
import java.util.*;
public class Powerx {
        public static double myPow(double x, int n) {
            double num = Math.abs((long)n);
            double result = 1.0;
    
            while (num > 0) {
                if (num % 2 == 1) {
                    result *= x;
                    num--;
                } else {
                    x *= x;
                    num /= 2;
                }
            }
    
            if (n < 0) {
                result = 1.0 / result;
            }
    
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            int n = sc.nextInt();
            double ans =  myPow(x,n);
            System.out.println(ans);
        }
}
