import java.util.*;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println("Enter Character: ");
        char c = sc.nextLine().charAt(0);

        System.out.println("Enter count of chars from start (k): ");
        int k = sc.nextInt();

        System.out.println("Enter frequency of the character in first k Characters: ");
        int f = sc.nextInt();
    
        int n = s.length();
        System.out.println(check(n,f,k,c,s));
    }
    public static int check(int n,int f,int k,char c,String s){
        for(int i=0;i<n;i++){
            int count = 0;
            String ret = rotate(s,n,i);
            for(int j=0;j<k;j++){
                if(ret.charAt(j)==c){
                    count++;
                }
            }
            if(count==f){
                return i;
            }
        }
        return -1;
    }
    public static String rotate(String s,int n,int i){
        return s.substring(n-i)+s.substring(0,n-i);
    }
}
