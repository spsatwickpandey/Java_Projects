import java.util.*;
public class KeyPadCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        ArrayList<String> ans = getkpc(n);
        System.out.println(ans);
    }
    static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getkpc(String s){
        if(s.length()==0){
            ArrayList<String> blanc = new ArrayList<>();
            blanc.add("");
            return blanc;
        }
        String ss = s.substring(1);
        ArrayList<String> subseq = getkpc(ss);
        String abbr = keypad[Integer.parseInt(s.charAt(0)+"")];
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0;i<abbr.length();i++){
            for(String alph:subseq){
                ans.add(abbr.charAt(i)+ alph);
            }
        }
        return ans;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }
}
