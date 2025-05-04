import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        permutate(s,"");
    }
    public static void permutate(String s,String asf){
        if(s.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<s.length();i++){
            char start = s.charAt(i);
            permutate(s.substring(0,i)+s.substring(i+1),asf+start);
        }
    }
}
