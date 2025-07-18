import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.println(reverse1(s1));
    }

    public static String reverse(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }

    public static String reverse1(String s) {     //optimal
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverse2(String s) {           //optimal
        return new StringBuilder(s).reverse().toString();
    }

}
