import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2: ");
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c)<0){
                return false;
            }
        }
        return true;
    }
}
