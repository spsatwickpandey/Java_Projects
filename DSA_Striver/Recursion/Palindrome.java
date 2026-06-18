import java.util.*;
//factorial.
public class Palindrome {
        
    public static boolean  pal(int i,String s){
        if(i>=(s.length()/2)){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }

        return pal(i+1,s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word: "); //only enter +ve natural numbers
        String s = sc.nextLine();

        System.out.println(pal(0,s));
        sc.close();
    }
}
