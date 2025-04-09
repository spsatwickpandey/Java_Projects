import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String s){
        if(s.length()==0){
            ArrayList<String> blanc = new ArrayList<>();
            blanc.add("");
            return blanc;
        }
        char ch = s.charAt(0);
        String ss = s.substring(1);
        ArrayList<String> subseq = gss(ss);
        ArrayList<String> mySubseq = new ArrayList<>();

        for(String str : subseq){
            mySubseq.add(str);
        }
        for(String str : subseq){
            mySubseq.add(ch+str);
        }
        return mySubseq;
    }
}
