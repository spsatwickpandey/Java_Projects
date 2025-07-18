import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println(removeDuplicateChars(s));

    }

    public static String removeDuplicateChars(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder ans = new StringBuilder();

        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            ans.append(c);
        }
        return ans.toString();
    }
}
