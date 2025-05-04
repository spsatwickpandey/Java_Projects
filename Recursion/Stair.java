import java.util.*;
public class Stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printstair(n,"");
    }
    public static void printstair(int n,String asf){
        if(n==0){
            System.out.println(asf);
            return;
        }
        if(n-1>=0){
            printstair(n-1,asf+1);
        }
        if(n-2>=0){
            printstair(n-2,asf+2);
        }
        if(n-3>=0){
            printstair(n-3,asf+3);
        }
    }
}
